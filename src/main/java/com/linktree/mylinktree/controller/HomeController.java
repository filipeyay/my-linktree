package com.linktree.mylinktree.controller;

import com.linktree.mylinktree.service.LinkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final LinkService linkService;

    public HomeController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("links", linkService.getLinks());
        return "index";
    }
}
