$(function() {

			"use strict";

			$(".gantt").gantt({
				source: "api/plan/data.json",
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