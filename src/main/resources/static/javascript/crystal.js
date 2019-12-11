/**
 * 主方法
 */
$(function(){
})


$.extend({
    sayHello: function() {//调用 $.sayHello();
       alert("hello")
    },
    mainTreeEvent:function(){//主菜单事件
		$("#left_tree").tree({
			onClick: function(node){
				//如果没有子节点，打开对应页面
				var target = node.target;
				var nodeChildrens=$(this).tree('getChildren',target);
				console.info(nodeChildrens.length)//====================================
				if(nodeChildrens.length>0){
					$(this).tree('toggle',node.target)
				}else{
					var cbp = $("#cbp").val()+"/";
					var attributes = node.attributes;
					var url = node.attributes.url+'.jsp';
					var content='<iframe src="'+cbp+url+'" width="100%" height="100%" scrolling="auto" style="border: none;"></iframe>';
					$("#centerTabs").tabs('add',{
						title:node.text,
						selected:true,
						content:content,
						closable:true
					});
				}
				/*
				$(tree).tree('collapseAll');
				$(tree).tree('expandTo',node.target);
				
				*/
			}
		});
	},
})

$.fn.myPlugin = function(options) {//调用 $('a').myPlugin();
    var defaults = {
        'color': 'red',
        'fontSize': '62px'
    };
    
    var settings = $.extend(defaults, options);
    
    return this.css({
        'color': settings.color,
        'fontSize': settings.fontSize
    });
}



























