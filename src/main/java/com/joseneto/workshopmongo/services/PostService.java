package com.joseneto.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joseneto.workshopmongo.domain.Post;
import com.joseneto.workshopmongo.repository.PostRepository;
import com.joseneto.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public Post findById(String id) {
		Optional<Post> user = postRepository.findById(id);
		
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}	
}
