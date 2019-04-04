var boardVue = new Vue ({
	el : "#vue_board",
	data : {
		category : 'board',
		resultDatas : {},
		url : location.origin + "/api",
		boardParam : {
			offset : 0
		}
	},
	created : function () {

	},
	mounted : function () {
		if (commonVue.queryString.currentPage == undefined || commonVue.queryString.currentPage.indexOf("-") == 0) {
			commonVue.queryString.currentPage = 1;
		}
		this.boardParam.offset = (commonVue.queryString.currentPage -1) * 20;
		localStorage.currentPage = commonVue.queryString.currentPage;
		
		axios({
			method: 'get',
			url: this.url + "/board",
			params : this.boardParam
		})
		.then(function (response) {
			this.resultDatas = response.data;
		}.bind(this))
		.catch(function(e) {
		});
	},
	methods : {
//		search : function () {
//			this.boardParam.offset = commonVue.offset;
//			
//			axios({
//				method: 'get',
//				url: this.url + "/board",
//				params : this.boardParam
//			})
//			.then(function (response) {
//				this.resultDatas = response.data;
//			}.bind(this))
//			.catch(function(e) {
//			});
//		},
		getBoardDetail : function (seq) {
			window.location.href = "/board/detail?seq=" + seq;
		},
		getIsPopularity : function (up, down) {
			if ((up - down) >= 5) {
				return true;
			} else {
				return false;
			}
		},
		getIsNew : function (regDate) {
			var date = new Date();
			var MM = date.getMonth() + 1;
			var DD = date.getDate();
			if(MM < 10) {
				MM = '0' + MM;
			} 

			if(DD < 10) {
				DD = '0' + DD;
			} 
			
			var curDate = MM + "-" + DD;
			if (regDate == curDate) {
				return true;
			} else {
				return false;
			}
		}
	},
	computed : function () {
		
	},
	watch : {
		
	}
});