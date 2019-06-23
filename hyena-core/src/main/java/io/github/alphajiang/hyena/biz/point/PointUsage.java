/*
 *  Copyright (C) 2019 Alpha Jiang. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alphajiang.hyena.biz.point;

import io.github.alphajiang.hyena.model.base.BaseObject;

import java.util.Date;

public class PointUsage extends BaseObject {
    private String type;
    private String uid;
    private long point;
    private Long recId; // 积分记录的ID
    private String tag;
    private String extra;
    private String note;
    private Date issueTime;
    private Date expireTime;


    public String getType() {
        return type;
    }

    public PointUsage setType(String type) {
        this.type = type;
        return this;
    }


    public String getUid() {
        return uid;
    }

    public PointUsage setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public long getPoint() {
        return point;
    }

    public PointUsage setPoint(long point) {
        this.point = point;
        return this;
    }

    public Long getRecId() {
        return recId;
    }

    public PointUsage setRecId(Long recId) {
        this.recId = recId;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public PointUsage setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getExtra() {
        return extra;
    }

    public PointUsage setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public String getNote() {
        return note;
    }

    public PointUsage setNote(String note) {
        this.note = note;
        return this;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public PointUsage setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
        return this;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
}
