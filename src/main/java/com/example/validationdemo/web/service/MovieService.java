package com.example.springdemo.web.service;



import com.example.validationdemo.web.domain.Movie;

import java.util.List;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-04-10-22:38
 **/
public interface MovieService {
	/**
	 * 批量添加
	 * @param movies
	 */
	public void batchAdd(List<Movie> movies);

	/**
	 * 添加电影
	 * @param movie
	 */
	public void addMovie(Movie movie);

	/**
	 * 删除电影
	 * @param id
	 */
	public void deleteMovie(String id);

	/**
	 * 修改电影
	 * @param movie
	 * @param id
	 */
	public void modifyMovie(Movie movie,String id);

	/**
	 * 根据ID查询电影
	 * @param id
	 * @return
	 */
	public Movie findMovieById(String id);
}
