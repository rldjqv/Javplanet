var boardVue = new Vue ({
	el : "#vue_board",
	data : {
		category : 'board',
		resultDatas : {},
		url : location.origin + "/api",
		boardParam : {
			offset : 0,
			searchText : ""
		},
	},
	created : function () {

	},
	mounted : function () {
		if (commonVue.queryString.currentPage == undefined || commonVue.queryString.currentPage.indexOf("-") == 0) {
			commonVue.queryString.currentPage = 1;
		}
		this.boardParam.offset = (commonVue.queryString.currentPage -1) * 20;
		localStorage.currentPage = commonVue.queryString.currentPage;
		
		if (commonVue.queryString.searchText == undefined || commonVue.queryString.searchText == '') {
			this.boardParam.searchText = "";
		} else {
			this.boardParam.searchText = decodeURI(commonVue.queryString.searchText);	
		}
		
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
		search : function () {
			this.boardParam.searchText = this.boardParam.searchText.trim();
			if (this.boardParam.searchText == undefined || this.boardParam.searchText == '') {
				alert("검색어를 입력해주시기 바랍니다.");
				return;
			}
			window.location.href = "?searchText=" + this.boardParam.searchText + "&currentPage=1";
//			if (commonVue.queryString.currentPage == undefined || commonVue.queryString.currentPage.indexOf("-") == 0) {
//				commonVue.queryString.currentPage = 1;
//			}
//			this.boardParam.offset = (commonVue.queryString.currentPage -1) * 20;
//			localStorage.currentPage = commonVue.queryString.currentPage;
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
		},
		getTitle : function (title) {
			var lowerSearchText = this.boardParam.searchText.toLowerCase(this.boardParam.searchText);
			var lowerSearchTextLength = lowerSearchText.length;
			var lowerTitle = title.toLowerCase(title);
			var startString = title.substring(0, lowerTitle.indexOf(lowerSearchText));
			var endString = title.substring(lowerTitle.indexOf(lowerSearchText)+lowerSearchTextLength);
			var focusString = title.substring(lowerTitle.indexOf(lowerSearchText), lowerTitle.indexOf(lowerSearchText)+lowerSearchTextLength);
			var title = startString + "<span style='color: red;'>" + focusString + "</span>" + endString;
			return title;
		},
		getBoardDetail : function (seq) {
			window.location.href = "/board/detail?seq=" + seq;
		},
		getNumber : function (index) {
			var number = (this.resultDatas.header.totalCnt - ((commonVue.queryString.currentPage -1) * 20)) - index;
			return number;
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
			
			MM < 10 ? MM = '0' + MM : MM = MM;
			DD < 10 ? DD = '0' + DD : DD = DD;
			
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