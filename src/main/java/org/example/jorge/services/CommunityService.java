package org.example.jorge.services;

import org.example.jorge.dto.ImageDTO;
import org.example.jorge.dto.MessageDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

// anotacion para indicar que es un servicio de spring boot
@Service
public class CommunityService {
    public List<MessageDTO> getCommunityMessages(int page){
        return Arrays.asList(
                new MessageDTO(1, "First message"),
                new MessageDTO(2, "Second message")
        );
    }

    public List<ImageDTO> getCommunityImages(int page){
        return Arrays.asList(
                new ImageDTO(1, "First title", null),
                new ImageDTO(2, "Second title", null)
        );
    }

    public MessageDTO postMessage(MessageDTO messageDTO){
        return new MessageDTO(3, "New message");
    }

    public ImageDTO postImages(MultipartFile file, String title){
        return new ImageDTO(3, "New image", null);
    }
}
