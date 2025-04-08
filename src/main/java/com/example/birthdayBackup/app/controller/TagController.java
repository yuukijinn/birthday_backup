package com.example.birthdayBackup.app.controller;

import com.example.birthdayBackup.app.beanMapper.TagCreateFormToDomainMapper;
import com.example.birthdayBackup.app.form.TagCreateForm;
import com.example.birthdayBackup.domain.model.Tag;
import com.example.birthdayBackup.usecase.tag.TagUsecase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * タグコントローラー
 */
@RestController
@AllArgsConstructor
@RequestMapping("/tags")
public class TagController {

    //依存クラス
    private final TagCreateFormToDomainMapper tagCreateFormToDomainMapper;
    private final TagUsecase tagUsecase;

    /**
     * タグ作成処理
     *
     * @param tagCreateForm タグ登録用form
     */
    @PostMapping
    public ResponseEntity<Void> createTag(@RequestBody TagCreateForm tagCreateForm) {
        //タグ登録フォームをタグドメインモデルに変換
        Tag tag = tagCreateFormToDomainMapper.translate(tagCreateForm);
        //タグを登録
        tagUsecase.createTag(tag);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
