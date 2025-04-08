package com.example.birthdayBackup.infrastructure.repository.tag;

import com.example.birthdayBackup.domain.model.Tag;
import com.example.birthdayBackup.domain.repository.TagRepository;
import com.example.birthdayBackup.infrastructure.mapper.tag.TagMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * タグリポジトリの実装クラス
 */
@Repository
@AllArgsConstructor
public class TagRepositoryImpl implements TagRepository {

    //依存クラス
    private final TagMapper tagMapper;

    /**
     * タグの登録
     *
     * @param tag 登録するタグ情報
     */
    @Override
    public void create(Tag tag) {
        //タグを登録
        tagMapper.insert(tag);
    }
}
