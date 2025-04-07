package com.example.birthdayBackup.usecase.tag;

import com.example.birthdayBackup.app.form.TagCreateForm;
import com.example.birthdayBackup.domain.model.Tag;
import com.example.birthdayBackup.domain.service.tag.TagService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * タグユースケース
 */
@Service
@AllArgsConstructor
public class TagUsecase {
    //依存クラス
    private final TagService tagService;


   public void createTag(Tag tag) {
       //タグの重複チェック

   }
}
