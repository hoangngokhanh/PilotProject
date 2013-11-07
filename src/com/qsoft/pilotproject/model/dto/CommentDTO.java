package com.qsoft.pilotproject.model.dto;

import com.google.gson.annotations.SerializedName;

/**
 * User: binhtv
 * Date: 11/7/13
 * Time: 3:10 PM
 */
public class CommentDTO
{
    @SerializedName("id")
    private Long commentId;
    @SerializedName("sound_id")
    private Long soundId;
    @SerializedName("user_id")
    private Long userId;
    @SerializedName("comment")
    private String comment;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("username")
    private String userName;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("avatar")
    private String avatar;


    public Long getCommentId()
    {
        return commentId;
    }

    public void setCommentId(Long commentId)
    {
        this.commentId = commentId;
    }

    public Long getSoundId()
    {
        return soundId;
    }

    public void setSoundId(Long soundId)
    {
        this.soundId = soundId;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public String getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public String getAvatar()
    {
        return avatar;
    }

    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }
}