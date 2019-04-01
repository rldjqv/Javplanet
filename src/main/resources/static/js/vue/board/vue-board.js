var boardJs = new Vue ({
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
		this.boardParam.offset = (commonJs.queryString.currentPage -1) * 20;
		
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
//			this.boardParam.offset = commonJs.offset;
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
		}
	},
	computed : function () {
		
	},
	watch : {
		
	}
});