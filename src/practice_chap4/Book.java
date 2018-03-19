package practice_chap4;

import java.util.Date;

public class Book implements Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	public String getTitle() {
		return title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public String getComment() {
		return comment;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((publishDate == null) ? 0 : publishDate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (publishDate == null) {
			if (other.publishDate != null)
				return false;
		} else if (!publishDate.equals(other.publishDate))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.comment = this.comment;
		result.publishDate = this.publishDate;
		return result;

	}

}
