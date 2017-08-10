package com.jikexueyuan.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 	FileName: FilterTwo.java
 *	desc: 第二个过滤器,只输出日志信息,不执行任何业务逻辑.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class FilterTwo implements Filter {

	/**
	 * 初始化过滤器
	 */
	public void init(FilterConfig config) throws ServletException {

		System.out.println("======= 初始化第2个过滤器 =======");
		//获取初始化参数

		String initParam = config.getInitParameter("param");
		//打印参数
		System.out.println("=======  第一个过滤器初始化参数 name = param; value = " + initParam + " ======= ");
	}

	/**
	 * 执行过滤器方法
	 */
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException,
			ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		System.out.println("======= 开始执行第2个过滤器的doFilter方法 =======");
		System.out.println("请求来源： " + request.getRequestURL().toString());
		chain.doFilter(req, resp);
		System.out.println("======= 结束执行第2个过滤器的doFilter方法 =======");
		System.out.println();
	}

	/**
	 * 销毁过滤器
	 */
	public void destroy() {
		System.out.println("======= 销毁第2个过滤器 =======");
	}

}
