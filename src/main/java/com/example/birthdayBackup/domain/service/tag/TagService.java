package com.example.birthdayBackup.domain.service.tag;

import com.example.birthdayBackup.domain.model.Tag;
import com.example.birthdayBackup.domain.repository.TagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * タグサービスクラス
 */
@Service
@AllArgsConstructor
public class TagService {

    //依存クラス
    private final TagRepository tagRepository;

    /**
     * タグ作成処理
     *
     * @param tag 登録するタグ情報
     */
    public void createTag(Tag tag) {
        //タグを登録
        tagRepository.create(tag);
    }
}
