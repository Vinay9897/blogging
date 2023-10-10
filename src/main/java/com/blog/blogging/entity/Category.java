package com.blog.blogging.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "category")
@NoArgsConstructor
public class Category {
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	
	private String categoryTitle;

	private String categoryDescription;
	
	@OneToMany(mappedBy = "category",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Post> posts = new ArrayList<>();
	
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	

}