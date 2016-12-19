package com.cloudage.membercenter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cloudage.membercenter.entity.Book;

public interface IBookRepository extends PagingAndSortingRepository<Book, Integer>{

	
}
