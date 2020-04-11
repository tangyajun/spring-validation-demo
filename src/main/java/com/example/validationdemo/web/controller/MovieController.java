package com.example.validationdemo.web.controller;


import com.example.springdemo.web.service.MovieService;
import com.example.validationdemo.web.domain.Movie;
import com.example.validationdemo.web.response.ResponseResult;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2019-12-27-13:51
 **/
@Validated
@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	MovieService movieService;
	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService=movieService;
	}

	@PostMapping(value = "/batch/")
	public ResponseResult AddMovies(@RequestBody  @NotEmpty(message = "Input movie list cannot be empty") List<@Valid Movie> movies) {

		movieService.batchAdd(movies);
		System.out.println("11111111111111111111");
		System.out.println(movies);
		return ResponseResult.success();
	}

	//  @EmailConstraint
	@PostMapping
	public ResponseResult addMovie(@RequestBody  @Valid Movie movie) {
		movieService.addMovie(movie);
		System.out.println("test");
		System.out.println(movie);
		return ResponseResult.success();
	}

	/**
	 * 修改电影
	 * @param movie
	 * @param id
	 */
	@PutMapping(value = "/{id}")
	public ResponseResult modifyMovie(@RequestBody Movie movie,
	                   @PathVariable String id) {
		movieService.modifyMovie(movie,id);
		return ResponseResult.success();
	}

	@DeleteMapping(value = "/{id}")
	public ResponseResult deleteMovie(@PathVariable String id) {
		return ResponseResult.success();
	}

	@GetMapping(value = "/{id}")
	public ResponseResult findMovieById(@PathVariable String id) {
		Movie movie=movieService.findMovieById(id);
		return ResponseResult.success(movie);
	}
}
