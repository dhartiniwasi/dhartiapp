package com.pichillilorenzo.flutter_inappwebview.types;

import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import java.util.HashMap;
import java.util.Map;

public class URLCredential {

    /* renamed from: id */
    private Long f36284id;
    private String password;
    private Long protectionSpaceId;
    private String username;

    public URLCredential(String str, String str2) {
        this.username = str;
        this.password = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        URLCredential uRLCredential = (URLCredential) obj;
        String str = this.username;
        if (str == null ? uRLCredential.username != null : !str.equals(uRLCredential.username)) {
            return false;
        }
        String str2 = this.password;
        String str3 = uRLCredential.password;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public Long getId() {
        return this.f36284id;
    }

    public String getPassword() {
        return this.password;
    }

    public Long getProtectionSpaceId() {
        return this.protectionSpaceId;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.username;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.password;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public void setId(Long l) {
        this.f36284id = l;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setProtectionSpaceId(Long l) {
        this.protectionSpaceId = l;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, this.username);
        hashMap.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.password);
        return hashMap;
    }

    public String toString() {
        return "URLCredential{username='" + this.username + '\'' + ", password='" + this.password + '\'' + '}';
    }

    public URLCredential(Long l, String str, String str2, Long l2) {
        this.f36284id = l;
        this.username = str;
        this.password = str2;
        this.protectionSpaceId = l2;
    }
}
