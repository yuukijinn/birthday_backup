package com.example.birthdayBackup.domain.repository;

import com.example.birthdayBackup.domain.model.Tag;
import org.springframework.stereotype.Repository;

/**
 * タグリポジトリ
 */
@Repository
public interface TagRepository {

    /**
     * タグを登録
     *
     * @param tag 登録するタグ情報
     */
    public void create(Tag tag);
}
