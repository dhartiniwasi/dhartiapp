package com.startapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONTokener;

/* renamed from: com.startapp.l4 */
/* compiled from: Sta */
public class C9111l4 extends C9126m2 {

    /* renamed from: d */
    public static final String[] f37271d = {"rowid", "timestamp", "sdkVersion", "category", "appActivity", "value", "details", "detailsJson", "dParam", "service", "tag"};

    /* renamed from: c */
    public final List<C8908d3<Void>> f37272c = new LinkedList();

    public C9111l4(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public final boolean mo29661a(C9023i4 i4Var, C9128m4 m4Var, SQLiteDatabase sQLiteDatabase, Map<String, String> map, long j) {
        C9023i4 i4Var2 = i4Var;
        C9128m4 m4Var2 = m4Var;
        Map<String, String> map2 = map;
        if (m4Var2.f37287a.size() > 0 && !m4Var2.f37287a.contains(i4Var2.f36952d)) {
            return false;
        }
        if (m4Var2.f37288b.size() > 0 && m4Var2.f37288b.contains(i4Var2.f36952d)) {
            return false;
        }
        if (m4Var2.f37289c.size() > 0 && !m4Var2.f37289c.contains(i4Var2.f36957i)) {
            return false;
        }
        if (m4Var2.f37290d.size() > 0 && m4Var2.f37290d.contains(i4Var2.f36957i)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2.containsKey("sdkVersion")) {
            linkedHashMap.put("sdkVersion", map2.get("sdkVersion"));
        }
        if (map2.containsKey("category")) {
            linkedHashMap.put("category", map2.get("category"));
        }
        for (String next : m4Var2.f37291e) {
            if (map2.containsKey(next)) {
                linkedHashMap.put(next, map2.get(next));
            }
        }
        int size = linkedHashMap.size();
        if (size >= 1) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList(size);
            String str = "";
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                sb.append(str);
                sb.append((String) entry.getKey());
                if (entry.getValue() == null) {
                    sb.append(" IS NULL");
                } else {
                    sb.append(" = ?");
                    arrayList.add(entry.getValue());
                }
                str = " AND ";
            }
            Pair pair = new Pair(sb.toString(), arrayList.toArray(new String[0]));
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.query("events", new String[]{"sendSuccess"}, (String) pair.first, (String[]) pair.second, (String) null, (String) null, "sendSuccess DESC");
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    if (j2 <= 0) {
                        return true;
                    }
                    long j3 = j - j2;
                    long j4 = m4Var2.f37292f;
                    if (j4 > 0 && j3 < j4) {
                        m48937a(cursor);
                        return true;
                    }
                }
                m48937a(cursor);
                return false;
            } finally {
                m48937a(cursor);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public final synchronized void mo29662b() {
        for (C8908d3<Void> call : this.f37272c) {
            call.call();
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events ( timestamp INTEGER NOT NULL, validTill INTEGER NOT NULL, sdkVersion TEXT NOT NULL, category TEXT NOT NULL, appActivity TEXT, value TEXT, details TEXT, detailsJson TEXT, dParam TEXT, service INTEGER NOT NULL DEFAULT 0, tag TEXT, priority INTEGER NOT NULL, attempt INTEGER NOT NULL DEFAULT 0, send INTEGER NOT NULL DEFAULT 0, sendFailure INTEGER NOT NULL DEFAULT 0, sendSuccess INTEGER NOT NULL DEFAULT 0, CHECK (attempt >= 0), CHECK (send >= 0), CHECK (sendFailure >= 0), CHECK (sendSuccess >= 0));");
    }

    /* renamed from: b */
    public static C9023i4 m48938b(Cursor cursor) {
        boolean z = false;
        long j = cursor.getLong(0);
        long j2 = cursor.getLong(1);
        m48936a(j, j2);
        String string = cursor.getString(2);
        C9043j4 a = C9043j4.m48704a(cursor.getString(3));
        String string2 = cursor.getString(4);
        String string3 = cursor.getString(5);
        String string4 = cursor.getString(6);
        String string5 = cursor.getString(7);
        String string6 = cursor.getString(8);
        if (cursor.getInt(9) == 1) {
            z = true;
        }
        String string7 = cursor.getString(10);
        if (string == null || string.trim().length() < 1) {
            throw new IllegalArgumentException();
        } else if (a != null) {
            Object obj = null;
            if (string5 != null) {
                try {
                    obj = new JSONTokener(string5).nextValue();
                } catch (JSONException unused) {
                }
            }
            C9023i4 i4Var = new C9023i4(a, j);
            i4Var.f36956h = Long.valueOf(j2);
            i4Var.f36951c = string;
            i4Var.f36957i = string2;
            i4Var.f36952d = string3;
            i4Var.f36953e = string4;
            i4Var.f36954f = obj;
            i4Var.f36955g = string6;
            i4Var.f36958j = z;
            i4Var.f36959k = string7;
            return i4Var;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo29659a(C8842b3<C9023i4, Void> b3Var, int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor cursor = null;
        try {
            cursor = mo29679a().query("events", f37271d, "attempt < " + i + " AND " + "validTill" + " >= " + currentTimeMillis + " AND " + "sendSuccess" + " = 0  AND " + "send" + " <= " + "sendFailure", (String[]) null, (String) null, (String) null, "priority DESC, timestamp ASC", String.valueOf(Math.max(1, i2)));
            while (cursor.moveToNext()) {
                b3Var.mo29129a(m48938b(cursor));
            }
        } finally {
            m48937a(cursor);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.lang.String[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* renamed from: a */
    public boolean mo29660a(C9023i4 i4Var, C9063k4 k4Var) {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ? r14;
        String str7;
        String str8;
        C9023i4 i4Var2 = i4Var;
        C9063k4 k4Var2 = k4Var;
        SQLiteDatabase a = mo29679a();
        a.beginTransaction();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis + k4Var2.f37042e;
            Long l = i4Var2.f36956h;
            if (l != null) {
                j = l.longValue();
            } else {
                i4Var2.f36956h = Long.valueOf(currentTimeMillis);
                j = currentTimeMillis;
            }
            Object obj = i4Var2.f36954f;
            String obj2 = obj != null ? obj.toString() : null;
            String str9 = i4Var2.f36951c;
            if (str9 == null) {
                str9 = "4.10.8";
            }
            String str10 = str9;
            List<C9128m4> list = k4Var2.f37044g;
            String str11 = "service";
            String str12 = "dParam";
            String str13 = "detailsJson";
            long j3 = j2;
            String str14 = "details";
            String str15 = "value";
            long j4 = j;
            String str16 = "events";
            String str17 = "sdkVersion";
            if (list.size() > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put(str17, str10);
                String str18 = str10;
                hashMap.put("category", i4Var2.f36949a.f37008a);
                hashMap.put("appActivity", i4Var2.f36957i);
                hashMap.put(str15, i4Var2.f36952d);
                hashMap.put(str14, i4Var2.f36953e);
                hashMap.put(str13, obj2);
                hashMap.put(str12, i4Var2.f36955g);
                hashMap.put(str11, i4Var2.f36958j ? "1" : "0");
                for (C9128m4 a2 : list) {
                    HashMap hashMap2 = hashMap;
                    String str19 = str12;
                    String str20 = str11;
                    String str21 = str13;
                    String str22 = str18;
                    String str23 = obj2;
                    String str24 = str14;
                    String str25 = str15;
                    String str26 = str17;
                    if (mo29661a(i4Var, a2, a, hashMap2, currentTimeMillis)) {
                        a.endTransaction();
                        return false;
                    }
                    str17 = str26;
                    str14 = str24;
                    str15 = str25;
                    hashMap = hashMap2;
                    str12 = str19;
                    str11 = str20;
                    obj2 = str23;
                    str18 = str22;
                    str13 = str21;
                }
                str4 = str12;
                str2 = str11;
                str = obj2;
                str3 = str13;
                str6 = str14;
                str8 = str18;
                str7 = str17;
                str5 = str15;
                r14 = 0;
            } else {
                str4 = str12;
                str2 = str11;
                str = obj2;
                str3 = str13;
                str6 = str14;
                str5 = str15;
                r14 = 0;
                str8 = str10;
                str7 = str17;
            }
            String str27 = str16;
            a.delete(str27, "validTill < " + currentTimeMillis, r14);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(j4));
            contentValues.put("validTill", Long.valueOf(j3));
            contentValues.put(str7, str8);
            contentValues.put("category", i4Var2.f36949a.f37008a);
            contentValues.put("appActivity", i4Var2.f36957i);
            contentValues.put(str5, i4Var2.f36952d);
            contentValues.put(str6, i4Var2.f36953e);
            contentValues.put(str3, str);
            contentValues.put(str4, i4Var2.f36955g);
            contentValues.put(str2, Integer.valueOf(i4Var2.f36958j ? 1 : 0));
            contentValues.put("tag", i4Var2.f36959k);
            contentValues.put("priority", Integer.valueOf(k4Var.f37040c));
            a.insertOrThrow(str27, r14, contentValues);
            a.setTransactionSuccessful();
            a.endTransaction();
            mo29662b();
            return true;
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m48936a(long j, long j2) {
        if (j <= 0) {
            throw new IllegalArgumentException();
        } else if (j2 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static int m48935a(SQLiteDatabase sQLiteDatabase, long j) {
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            cursor = sQLiteDatabase2.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, (String) null);
            if (cursor.moveToFirst()) {
                return cursor.getInt(0);
            }
            throw new IllegalStateException();
        } finally {
            m48937a(cursor);
        }
    }

    /* renamed from: a */
    public static void m48937a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }
}
