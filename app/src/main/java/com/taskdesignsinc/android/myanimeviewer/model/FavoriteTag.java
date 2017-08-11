package com.taskdesignsinc.android.myanimeviewer.model;

import java.util.Comparator;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Generated;
import io.objectbox.annotation.apihint.Internal;

@Entity
public class FavoriteTag {

    @Id
    private long id = 0;
    private int tagId = -1;
    private String title = "";
    private int ribbonId = -1;

    @Generated(30053616)
    @Internal
    /** This constructor was generated by ObjectBox and may change any time. */
    public FavoriteTag(long id, int tagId, String title, int ribbonId) {
        this.id = id;
        this.tagId = tagId;
        this.title = title;
        this.ribbonId = ribbonId;
    }

    @Generated(786092308)
    public FavoriteTag() {
    }

    public FavoriteTag(int tagId, String title, int ribbonId) {
        this.tagId = tagId;
        this.title = title;
        this.ribbonId = ribbonId;
    }

    @Override
    public String toString() {
        return "FavoriteTag [tagId=" + tagId + ", title=" + title + ", ribbonId=" + ribbonId + "]";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRibbonID() {
        return ribbonId;
    }

    public void setRibbonID(int ribbonID) {
        ribbonId = ribbonID;
    }

    public int getRibbonId() {
        return ribbonId;
    }

    public void setRibbonId(int ribbonId) {
        this.ribbonId = ribbonId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public enum Order implements Comparator<FavoriteTag> {
        ByTagIdLowToHigh() {
            @Override
            public int compare(FavoriteTag tag1, FavoriteTag tag2) {
                int tagId1 = tag1.getTagId();
                int tagId2 = tag2.getTagId();

                if (tagId1 == tagId2)
                    return 0;
                else if (tagId1 > tagId2)
                    return 1;
                else
                    return -1;
            }
        }
    }
}
