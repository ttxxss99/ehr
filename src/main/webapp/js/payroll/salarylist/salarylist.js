let deleteSet = new Set();
function member_del(id){
	let url = "/payroll/salarylist/deletesalarylist?Id="+id;
	$.post(url,{},()=>{
		layer.msg('Deleted',{icon:1,time:1000});
		reloadTable();
	});
}
function delSome(){
	deleteSet.forEach(e=>member_del(e));
}
function reloadTable(){
	let table = layui.table;
	table.reload(("TableId"),{
		page:{curr:1}
	});
}
	
!function initTable(){
	layui.use('table',function(){
		let table = layui.table;
        table.on('checkbox(layTable)', function(obj){
            let checkStatus = table.checkStatus('TableId'),
            	data = checkStatus.data;
            //console.log(data);
            deleteSet.clear();
            for (let i = 0 ; i < data.length ; i++){
                deleteSet.add(data[i].id);
            }
            //console.log(deleteSet);
        });
		table.render({
			elem: "#layTable",
			toolbar: "#toolbarDemo",
			title: "工资条",
			id: "TableId",
			cols: [[
				{type: 'checkbox',fixed: 'left',},
				{field: 'empId',title: '编号'},
				{field: 'empname',title:"对应员工"},
				{field: 'shouldsend',title: '应发工资'},
				{field: 'bonus',title:'奖金'},
				{field: 'fine',title:'罚款'},
				{field: 'insured',title:'投保'},
				{field: 'time',title:'发放时间'},
				{field: 'realhair',title:'实发工资'},
				{fixed: 'right',title: '操作', toolbar: '#barDemo',}
			]],
			page: true,
			url : '/payroll/salarylist/salarylistList',
			request: {
				pageName: 'pageNum',
				limitName: 'pageSize'
			},
			method: 'post',
			parseData: function(res){
				res.data.list.map(x=>x.purchaserate+='%');
				return {
                    "code": res.code, //解析接口状态
                    "msg": res.msg, //解析提示文本
                    "count": res.count.total, //解析数据长度
                    "data": res.data.list //解析数据列表					
				}
			},
			done: function(res,curr,count){
				table.render();
			}
		});
		
		table.on('toolbar(layTable)',function(obj){
			console.log(obj);
			let checkStatus = table.checkStatus(obj.config.id);
			let data = checkStatus.data;
			switch(obj.event){
				case 'getCheckData':
					layer.alert(JSON.stringify(data));
					break;
                case 'getCheckLength':
                    layer.msg('选中了：'+ data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选': '未全选');
                    break;
            };
		});
		
		table.on('tool(layTable)',function(obj){
            let data = obj.data;
            console.log(data.id);
            if(obj.event === 'detail'){
                layer.msg('ID：'+ data.id + ' 的查看操作');
            } else if(obj.event === 'del'){
                layer.confirm('确定删除吗？', function(index){
                    member_del(data.id);//删除
                    obj.del();
                    layer.close(index);
                });
            }
		});
	});
}();