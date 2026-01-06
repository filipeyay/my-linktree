package com.linktree.mylinktree.service;

import com.linktree.mylinktree.model.Link;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkService {
    public List<Link> getLinks() {
        return List.of(
                new Link("GitHub", "https://github.com/filipeyay")
        );
    }
}
