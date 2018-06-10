package com.mtdhb.api.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

/**
 * @author i@huangdenghe.com
 * @date 2017/12/08
 */
@Data
public class MailDTO {

    @NotEmpty
    @Email
    private String mail;
    @NotNull
    @Size(min = 4, max = 4)
    private String captcha;

}
