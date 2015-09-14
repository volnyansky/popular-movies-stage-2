package stanislav.volnjanskij.popularmovies.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import stanislav.volnjanskij.popularmovies.db.Movie;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MOVIE".
*/
public class MovieDao extends AbstractDao<Movie, Long> {

    public static final String TABLENAME = "MOVIE";

    /**
     * Properties of entity Movie.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Overview = new Property(1, String.class, "overview", false, "OVERVIEW");
        public final static Property Poster_path = new Property(2, String.class, "poster_path", false, "POSTER_PATH");
        public final static Property Title = new Property(3, String.class, "title", false, "TITLE");
        public final static Property VoteAvarage = new Property(4, String.class, "voteAvarage", false, "VOTE_AVARAGE");
        public final static Property ReleaseDate = new Property(5, String.class, "releaseDate", false, "RELEASE_DATE");
        public final static Property Runtime = new Property(6, Integer.class, "runtime", false, "RUNTIME");
        public final static Property CachedPosterPath = new Property(7, String.class, "cachedPosterPath", false, "CACHED_POSTER_PATH");
    };


    public MovieDao(DaoConfig config) {
        super(config);
    }
    
    public MovieDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MOVIE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"OVERVIEW\" TEXT," + // 1: overview
                "\"POSTER_PATH\" TEXT," + // 2: poster_path
                "\"TITLE\" TEXT," + // 3: title
                "\"VOTE_AVARAGE\" TEXT," + // 4: voteAvarage
                "\"RELEASE_DATE\" TEXT," + // 5: releaseDate
                "\"RUNTIME\" INTEGER," + // 6: runtime
                "\"CACHED_POSTER_PATH\" TEXT);"); // 7: cachedPosterPath
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MOVIE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Movie entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String overview = entity.getOverview();
        if (overview != null) {
            stmt.bindString(2, overview);
        }
 
        String poster_path = entity.getPoster_path();
        if (poster_path != null) {
            stmt.bindString(3, poster_path);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(4, title);
        }
 
        String voteAvarage = entity.getVoteAvarage();
        if (voteAvarage != null) {
            stmt.bindString(5, voteAvarage);
        }
 
        String releaseDate = entity.getReleaseDate();
        if (releaseDate != null) {
            stmt.bindString(6, releaseDate);
        }
 
        Integer runtime = entity.getRuntime();
        if (runtime != null) {
            stmt.bindLong(7, runtime);
        }
 
        String cachedPosterPath = entity.getCachedPosterPath();
        if (cachedPosterPath != null) {
            stmt.bindString(8, cachedPosterPath);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Movie readEntity(Cursor cursor, int offset) {
        Movie entity = new Movie( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // overview
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // poster_path
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // title
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // voteAvarage
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // releaseDate
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // runtime
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // cachedPosterPath
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Movie entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setOverview(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPoster_path(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setVoteAvarage(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setReleaseDate(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setRuntime(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setCachedPosterPath(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Movie entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Movie entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}