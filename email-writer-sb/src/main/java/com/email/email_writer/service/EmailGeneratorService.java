package com.email.email_writer.service;


import com.email.email_writer.dto.EmailRequestDTO;

public interface EmailGeneratorService {

    String generateEmailReply(EmailRequestDTO emailRequestDTO);

}
