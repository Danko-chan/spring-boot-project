package com.sbp.clone.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

import com.sbp.clone.models.Anime;
import com.sbp.clone.models.Anime.Type;

@Slf4j
@Controller
@RequestMapping("/anime")
public class AnimeController {
	
	@GetMapping
	public String showDesignForm(Model model) {
	List<Anime> animes = Arrays.asList(
	new Anime("1", "Clannad", Type.Completed),
	new Anime("2", "Free", Type.Watching),
	new Anime("3", "Grand Blue", Type.Completed),
	new Anime("4", "Hyouka", Type.Completed),
	new Anime("5", "Death Note", Type.Completed),
	new Anime("6", "Naruto", Type.Completed),
	new Anime("7", "Bleach", Type.Completed),
	new Anime("8", "One Piece", Type.OnHold),
	new Anime("9", "Black Clover", Type.Watching),
	new Anime("10", "Solo Leveling", Type.Watchlist)
	);
	Type[] types = Anime.Type.values();
	for (Type type : types) {
	model.addAttribute(type.toString().toLowerCase(),
	filterByType(animes, type));
	}
	model.addAttribute("design", new Anime());
	return "design";
	}

}
