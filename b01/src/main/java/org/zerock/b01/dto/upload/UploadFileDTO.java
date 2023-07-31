package org.zerock.b01.dto.upload;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class UploadFileDTO {

    private List<MultipartFile> files;

}
