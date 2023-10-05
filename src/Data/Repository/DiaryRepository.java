package Data;

import Data.Models.Diary;

public interface DiaryRepository {
    Diary save(Diary diary);

    void delete(Diary diary);

    Diary findById(int id);

    Iterable<Diary> findAll();

    long count();
    void clear();
}
