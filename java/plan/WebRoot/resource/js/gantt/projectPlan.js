$(function() {

			"use strict";

			$(".gantt").gantt({
				source: [{
						name: "便民通行证",
						desc: "接口修改",
						values: [{
							from: "/Date(1409500800000)/",
							to: "/Date(1412092799000)/",
							label: "接口修改",
							customClass: "ganttRed"
					}]
					},{
						name: "mimi静态页面",
						desc: "静态页面",
						values: [{
							from: "/Date(1408291200000)/",
							to: "/Date(1410796799000)/",
							label: "静态页面设计与制作",
							customClass: "ganttGreen"
						}]
					},{
						name: "mimi网",
						desc: "需求设计",
						values: [{
							from: "/Date(1408291200000)/",
							to: "/Date(1408723199000)/",
							label: "需求设计",
							customClass: "ganttBlue"
						}]
					},{
						name: " ",
						desc: "管理平台开发",
						values: [{
							from: "/Date(1408896000000)/",
							to: "/Date(1410364799000)/",
							label: "管理平台开发",
							customClass: "ganttBlue"
						}]
					},{
						name: " ",
						desc: "网站开发",
						values: [{
							from: "/Date(1410364800000)/",
							to: "/Date(1412092799000)/",
							label: "网站开发",
							customClass: "ganttBlue"
						}]
					},{
						name: " ",
						desc: "系统测试",
						values: [{
							from: "/Date(1412092800000)/",
							to: "/Date(1413302400000)/",
							label: "系统测试",
							customClass: "ganttBlue"
					}]
				}],
				navigate: "scroll",
				maxScale: "hours",
				itemsPerPage: 10,
				onItemClick: function(data) {
					//alert("Item clicked - show some details");
				},
				onAddClick: function(dt, rowId) {
					//alert("Empty space clicked - add an item!");
				},
				onRender: function() {
					//if (window.console && typeof console.log === "function") {
					//	console.log("chart rendered");
					//}
				}
			});

			$(".gantt").popover({
				selector: ".bar",
				title: "",
				content: "",
				trigger: "hover"
			});

			prettyPrint();

		});