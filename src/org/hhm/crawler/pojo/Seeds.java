package org.hhm.crawler.pojo;

import org.hhm.crawler.util.md5.MD5;
import org.jsoup.select.Elements;

public class Seeds implements Cloneable {

	@Override
	public Object clone() {
		Seeds seeds = null;

		try {
			seeds = (Seeds) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return seeds;
	}

	private String url;
	private String id;
	private int point_depth;
	private String filterSuffix;
	private String directDomain;
	private String md5;

	public Elements getTitle() {
		return title;
	}

	public void setTitle(Elements title) {
		this.title = title;
	}

	public Elements getText() {
		return text;
	}

	public void setText(Elements text) {
		this.text = text;
	}

	public Elements getTime() {
		return time;
	}

	public void setTime(Elements time) {
		this.time = time;
	}

	public Elements getAuthor() {
		return author;
	}

	public void setAuthor(Elements author) {
		this.author = author;
	}

	private Elements title;
	private Elements text;
	private Elements time;
	private Elements author;

	public int getNow_depth() {
		return now_depth;
	}

	public void setNow_depth(int now_depth) {
		this.now_depth = now_depth;
	}

	private int now_depth;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((md5 == null) ? 0 : md5.hashCode());
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
		Seeds other = (Seeds) obj;
		if (md5 == null) {
			if (other.md5 != null)
				return false;
		} else if (!md5.equals(other.md5))
			return false;
		return true;
	}

	public int getPoint_depth() {
		return point_depth;
	}

	public void setPoint_depth(int point_depth) {
		this.point_depth = point_depth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
		MD5 md5 = new MD5();
		setMd5(md5.MD5Encode(url));

	}

	public String getFilterSuffix() {
		return filterSuffix;
	}

	public void setFilterSuffix(String filterSuffix) {
		this.filterSuffix = filterSuffix;
	}

	public String getDirectDomain() {
		return directDomain;
	}

	public void setDirectDomain(String directDomain) {
		this.directDomain = directDomain;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	@Override
	public String toString() {
		return "Seeds [url=" + url + ", title=" + title + ", text=" + text
				+ ", time=" + time + ", author=" + author + ", md5=" + md5
				+ ", depth=" + point_depth + ", filterSuffix=" + filterSuffix
				+ ", directDomain=" + directDomain + "]";
	}

}
