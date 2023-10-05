package Data;

import Data.Models.Entry;

public interface EntryRepository {
    Entry save(Entry diary);

    void delete(Entry diary);

    Entry findBYiD(int id);

    Iterable<Entry> findAll();

    long count();
    void clear();
}
