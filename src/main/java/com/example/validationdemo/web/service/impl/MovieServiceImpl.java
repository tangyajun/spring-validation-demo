package com.example.validationdemo.web.service.impl;


import com.example.springdemo.web.service.MovieService;
import com.example.validationdemo.web.domain.Movie;
import com.example.validationdemo.web.repository.MovieDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-04-10-22:47
 **/
@Service
public class MovieServiceImpl implements MovieService {

	private MovieDao movieDao;

	@Autowired
	public MovieServiceImpl(MovieDao movieDao) {
		this.movieDao=movieDao;
	}

	@Override
	public void batchAdd(List<Movie> movies) {

	}

	@Override
	public void addMovie(Movie movie) {
		//业务代码
		movieDao.save(movie);
	}

	@Override
	public void deleteMovie(String id) {

	}

	@Override
	public void modifyMovie(Movie movie, String id) {

	}

	@Override
	public Movie findMovieById(String id) {
		return null;
	}
}
