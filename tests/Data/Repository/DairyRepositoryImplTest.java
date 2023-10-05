package Data;


import Data.Models.Diary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DairyRepositoryImplTest {


    @Test
    public void testThatDiarySaved_increasesCount() {
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary = new Diary();
        diaryRepository.save(diary);
        assertEquals(1, diaryRepository.count());

        Diary newDiary = new Diary();
        diaryRepository.save(newDiary);
        assertEquals(2, diaryRepository.count());
    }
}
