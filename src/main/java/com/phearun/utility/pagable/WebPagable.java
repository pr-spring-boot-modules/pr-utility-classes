package com.phearun.utility.pagable;

public class WebPagable extends Pagable {

	private int nextPage;
	
	private int previousPage;
	
	private int pagesToShow;
	
	private int startPage;
	
	private int endPage;

	public WebPagable() {
		this(1, 1, 5, 1, 1);
	}
	
	public WebPagable(int nextPage, int previousPage, int pagesToShow, int startPage, int endPage) {
		super();
		this.nextPage = nextPage;
		this.previousPage = previousPage;
		this.pagesToShow = pagesToShow;
		this.startPage = startPage;
		this.endPage = endPage;
	}
	
	public int getNextPage() {
		return (int) (page >= this.getPagesTotal() ? this.getPagesTotal() : this.page + 1);
	}

	public int getPreviousPage() {
		return (page <= 1) ? 1 : page - 1;
	}

	public int getPagesToShow() {
		return pagesToShow;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setPagesToShow(int pagesToShow) {
		this.pagesToShow = pagesToShow;
	}

	@Override
	public void setRecordsFiltered(int recordsFiltered) {
		super.setRecordsFiltered(recordsFiltered);
		this.setStartPageEndPage(this.getPagesTotal());
	}

	// TODO:
	private void setStartPageEndPage(int totalPages) {
		int halfPagesToShow = pagesToShow / 2;

		if (totalPages <= pagesToShow) {
			startPage = 1;
			endPage = totalPages;

		} else if (page - halfPagesToShow <= 0) {
			startPage = 1;
			endPage = pagesToShow;

		} else if (page + halfPagesToShow == totalPages) {
			startPage = page - halfPagesToShow;
			endPage = totalPages;

		} else if (page + halfPagesToShow > totalPages) {
			startPage = totalPages - pagesToShow + 1;
			endPage = totalPages;

		} else {
			startPage = page - halfPagesToShow;
			endPage = page + halfPagesToShow;
		}
	}

	@Override
	public String toString() {
		return "WebPagable [nextPage=" + nextPage + ", previousPage=" + previousPage + ", pagesToShow=" + pagesToShow
				+ ", startPage=" + startPage + ", endPage=" + endPage + ", page=" + page + ", limit=" + limit
				+ ", pagesTotal=" + pagesTotal + ", draw=" + draw + ", recordsTotal=" + recordsTotal
				+ ", recordsFiltered=" + recordsFiltered + ", offset=" + offset + "]";
	}

}
