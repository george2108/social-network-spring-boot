package org.example.jorge.controllers;

import org.example.jorge.dto.ImageDTO;
import org.example.jorge.dto.MessageDTO;
import org.example.jorge.services.CommunityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
import java.util.List;

// rest controller indica que recibe solicitudes http
@RestController
// request mapping indica el inicio del endpoint del controller
@RequestMapping("/v1/community")
public class CommunityController {
    private final CommunityService communityService;

    public CommunityController(CommunityService communityService) {
        this.communityService = communityService;
    }

    @GetMapping("/messages")
    public ResponseEntity<List<MessageDTO>> getCommunityMessages(
            @RequestParam(value="page", defaultValue = "0", required = true) int page
    ){
        return ResponseEntity.ok(communityService.getCommunityMessages(page));
    }

    @GetMapping("/images")
    public ResponseEntity<List<ImageDTO>> getCommunityImages(
            @RequestParam(value="page", defaultValue = "0", required = true) int page
    ){
        return ResponseEntity.ok(communityService.getCommunityImages(page));
    }

    @PostMapping("/message")
    public ResponseEntity<MessageDTO> postMessage(
            @RequestBody MessageDTO messageDTO
    ){
        return ResponseEntity.created(URI.create("/v1/community/messages"))
                .body(communityService.postMessage(messageDTO));
    }

    @PostMapping("/images")
    public ResponseEntity<ImageDTO> postImages(
            @RequestParam MultipartFile file,
            @RequestParam(value = "title") String title
    ){
        return ResponseEntity.created(URI.create("/v1/community/images"))
                .body(communityService.postImages(file, title));
    }
}
