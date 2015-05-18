package org.hhm.crawler.init;

import java.util.List;

import org.hhm.crawler.pojo.Seeds;
import org.hhm.crawler.update.BloomFilter;
import org.hhm.crawler.update.Crawldb;
import org.hhm.crawler.util.xml.XMLElement;
import org.hhm.crawler.util.xml.XmlBean;

public class Init {

	static Crawldb crawldb = Crawldb.getInstance();

	static BloomFilter bloomFilter = BloomFilter.getInstance();

	public void action() {
		XmlBean xmlBean = new XmlBean();

		// 获取种子列表
		List<Seeds> seedlist = xmlBean.getSeeds(new XMLElement(
				"config/Seeds.xml").get());
		// 初始化布隆过滤器
		bloomFilter.init();

		xmlBean.getConfig(new XMLElement("config/Config.xml").get());
		xmlBean.getDBConfig(new XMLElement("config/DBConfig.xml").get());

		// 存入待抓队列
		for (int i = 0; i < seedlist.size(); i++) {
			// 设置初始深度为0
			seedlist.get(i).setNow_depth(0);

			crawldb.set(seedlist.get(i));

		}

	}

}
