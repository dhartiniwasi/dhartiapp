package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.measurement.C7150r4;
import com.google.android.gms.internal.measurement.C7238wc;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.l */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7414l extends C7478q8 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f32676f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f32677g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f32678h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f32679i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f32680j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f32681k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String[] f32682l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String[] f32683m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C7403k f32684d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7434m8 f32685e = new C7434m8(this.f32389a.mo24116a());

    C7414l(C7303a9 a9Var) {
        super(a9Var);
        this.f32389a.mo24443z();
        this.f32684d = new C7403k(this, this.f32389a.mo24121d(), "google_app_measurement.db");
    }

    /* renamed from: H */
    static final void m41713H(ContentValues contentValues, String str, Object obj) {
        C4141r.m28217g("value");
        C4141r.m28221k(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: I */
    private final long m41714I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo24472P().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24210c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: K */
    private final long m41715K(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo24472P().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24210c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0088=Splitter:B:29:0x0088, B:12:0x003e=Splitter:B:12:0x003e} */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24466G(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.C7563y8 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            p033d5.C4141r.m28221k(r26)
            r20.mo24189f()
            r20.mo24623g()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo24472P()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0071
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            java.lang.String r5 = "rowid <= ? and "
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r5 != 0) goto L_0x0062
            r4.close()
            return
        L_0x0062:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()     // Catch:{ SQLiteException -> 0x006e }
            goto L_0x00b3
        L_0x006e:
            r0 = move-exception
            goto L_0x020b
        L_0x0071:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0080
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            goto L_0x0084
        L_0x0080:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
        L_0x0084:
            if (r4 == 0) goto L_0x0088
            java.lang.String r5 = " and rowid <= ?"
        L_0x0088:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r5 = " order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r5 != 0) goto L_0x00ac
            r4.close()
            return
        L_0x00ac:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()     // Catch:{ SQLiteException -> 0x006e }
        L_0x00b3:
            r16 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = 0
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            if (r4 != 0) goto L_0x00f4
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r3)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r0.mo24209b(r2, r4)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r12.close()
            return
        L_0x00f4:
            byte[] r4 = r12.getBlob(r15)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.internal.measurement.b5 r5 = com.google.android.gms.internal.measurement.C6906c5.m39757P1()     // Catch:{ IOException -> 0x01da }
            com.google.android.gms.internal.measurement.ma r4 = com.google.android.gms.measurement.internal.C7325c9.m41387C(r5, r4)     // Catch:{ IOException -> 0x01da }
            com.google.android.gms.internal.measurement.b5 r4 = (com.google.android.gms.internal.measurement.C6889b5) r4     // Catch:{ IOException -> 0x01da }
            com.google.android.gms.internal.measurement.h9 r4 = r4.mo23357k()     // Catch:{ IOException -> 0x01da }
            com.google.android.gms.internal.measurement.c5 r4 = (com.google.android.gms.internal.measurement.C6906c5) r4     // Catch:{ IOException -> 0x01da }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            if (r5 == 0) goto L_0x0121
            com.google.android.gms.measurement.internal.j4 r5 = r1.f32389a     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24261w()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r3)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r5.mo24209b(r6, r7)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
        L_0x0121:
            r12.close()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            p033d5.C4141r.m28221k(r4)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r2.f33208a = r4     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r11 = 3
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0141
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r13 = 1
            r5[r13] = r17     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r7 = r4
            r8 = r5
            goto L_0x014d
        L_0x0141:
            r13 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r6[r13] = r17     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r7 = r4
            r8 = r6
        L_0x014d:
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r14 = "rowid"
            r16 = 0
            r4 = r0
            r13 = 3
            r11 = r14
            r14 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r0 == 0) goto L_0x01c3
        L_0x0171:
            long r5 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x006e }
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.internal.measurement.q4 r7 = com.google.android.gms.internal.measurement.C7150r4.m40779G()     // Catch:{ IOException -> 0x01a3 }
            com.google.android.gms.internal.measurement.ma r0 = com.google.android.gms.measurement.internal.C7325c9.m41387C(r7, r0)     // Catch:{ IOException -> 0x01a3 }
            com.google.android.gms.internal.measurement.q4 r0 = (com.google.android.gms.internal.measurement.C7134q4) r0     // Catch:{ IOException -> 0x01a3 }
            r7 = 1
            java.lang.String r8 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo23748A(r8)     // Catch:{ SQLiteException -> 0x006e }
            r8 = 2
            long r9 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo23752E(r9)     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.internal.measurement.h9 r0 = r0.mo23357k()     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.internal.measurement.r4 r0 = (com.google.android.gms.internal.measurement.C7150r4) r0     // Catch:{ SQLiteException -> 0x006e }
            boolean r0 = r2.mo24766a(r5, r0)     // Catch:{ SQLiteException -> 0x006e }
            if (r0 != 0) goto L_0x01b9
            r4.close()
            return
        L_0x01a3:
            r0 = move-exception
            r7 = 1
            r8 = 2
            com.google.android.gms.measurement.internal.j4 r5 = r1.f32389a     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r3)     // Catch:{ SQLiteException -> 0x006e }
            r5.mo24210c(r6, r9, r0)     // Catch:{ SQLiteException -> 0x006e }
        L_0x01b9:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x006e }
            if (r0 != 0) goto L_0x0171
            r4.close()
            return
        L_0x01c3:
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r3)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo24209b(r2, r5)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()
            return
        L_0x01da:
            r0 = move-exception
            r14 = r12
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r3)     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            r2.mo24210c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            r14.close()
            return
        L_0x01f3:
            r0 = move-exception
            goto L_0x01f9
        L_0x01f5:
            r0 = move-exception
            goto L_0x01fd
        L_0x01f7:
            r0 = move-exception
            r14 = r12
        L_0x01f9:
            r3 = r14
            goto L_0x0226
        L_0x01fb:
            r0 = move-exception
            r14 = r12
        L_0x01fd:
            r4 = r14
            goto L_0x020b
        L_0x01ff:
            r0 = move-exception
            r3 = r16
            goto L_0x0226
        L_0x0203:
            r0 = move-exception
            r4 = r16
            goto L_0x020b
        L_0x0207:
            r0 = move-exception
            goto L_0x0226
        L_0x0209:
            r0 = move-exception
            r4 = r3
        L_0x020b:
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a     // Catch:{ all -> 0x0224 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x0224 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r3)     // Catch:{ all -> 0x0224 }
            r2.mo24210c(r5, r3, r0)     // Catch:{ all -> 0x0224 }
            if (r4 == 0) goto L_0x0223
            r4.close()
        L_0x0223:
            return
        L_0x0224:
            r0 = move-exception
            r3 = r4
        L_0x0226:
            if (r3 == 0) goto L_0x022b
            r3.close()
        L_0x022b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7414l.mo24466G(java.lang.String, long, long, com.google.android.gms.measurement.internal.y8):void");
    }

    /* renamed from: J */
    public final int mo24467J(String str, String str2) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        mo24189f();
        mo24623g();
        try {
            return mo24472P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24211d("Error deleting conditional property", C7352f3.m41475z(str), this.f32389a.mo24414D().mo24097f(str2), e);
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final long mo24468L(String str, String str2) {
        String str3 = str;
        C4141r.m28217g(str);
        C4141r.m28217g("first_open_count");
        mo24189f();
        mo24623g();
        SQLiteDatabase P = mo24472P();
        P.beginTransaction();
        long j = 0;
        try {
            long K = m41715K("select " + "first_open_count" + " from app2 where app_id=?", new String[]{str3}, -1);
            if (K == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (P.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f32389a.mo24135l().mo24256q().mo24210c("Failed to insert column (got -1). appId", C7352f3.m41475z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                K = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put("first_open_count", Long.valueOf(1 + K));
                if (((long) P.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    this.f32389a.mo24135l().mo24256q().mo24210c("Failed to update column (got 0). appId", C7352f3.m41475z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                P.setTransactionSuccessful();
                P.endTransaction();
                return K;
            } catch (SQLiteException e) {
                e = e;
                j = K;
                try {
                    this.f32389a.mo24135l().mo24256q().mo24211d("Error inserting column. appId", C7352f3.m41475z(str), "first_open_count", e);
                    P.endTransaction();
                    return j;
                } catch (Throwable th) {
                    P.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f32389a.mo24135l().mo24256q().mo24211d("Error inserting column. appId", C7352f3.m41475z(str), "first_open_count", e);
            P.endTransaction();
            return j;
        }
    }

    /* renamed from: M */
    public final long mo24469M() {
        return m41715K("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* renamed from: N */
    public final long mo24470N() {
        return m41715K("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: O */
    public final long mo24471O(String str) {
        C4141r.m28217g(str);
        return m41715K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final SQLiteDatabase mo24472P() {
        mo24189f();
        try {
            return this.f32684d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24261w().mo24209b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo24473Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo24189f()
            r7.mo24623g()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo24472P()     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ba }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.j4 r8 = r7.f32389a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.f3 r8 = r8.mo24135l()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.d3 r8 = r8.mo24260v()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo24208a(r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.internal.measurement.q4 r3 = com.google.android.gms.internal.measurement.C7150r4.m40779G()     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.ma r2 = com.google.android.gms.measurement.internal.C7325c9.m41387C(r3, r2)     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.q4 r2 = (com.google.android.gms.internal.measurement.C7134q4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.h9 r2 = r2.mo23357k()     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.C7150r4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.measurement.internal.a9 r8 = r7.f32873b     // Catch:{ SQLiteException -> 0x00ba }
            r8.mo24127g0()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.List r8 = r2.mo23813K()     // Catch:{ SQLiteException -> 0x00ba }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00ba }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00ba }
        L_0x0056:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00ba }
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.internal.measurement.v4 r3 = (com.google.android.gms.internal.measurement.C7214v4) r3     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = r3.mo23949I()     // Catch:{ SQLiteException -> 0x00ba }
            boolean r5 = r3.mo23952V()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0074
            double r5 = r3.mo23945C()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0074:
            boolean r5 = r3.mo23953W()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0082
            float r3 = r3.mo23946D()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0082:
            boolean r5 = r3.mo23956Z()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0090
            java.lang.String r3 = r3.mo23950J()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0090:
            boolean r5 = r3.mo23954X()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0056
            long r5 = r3.mo23948F()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x009e:
            r1.close()
            return r2
        L_0x00a2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.j4 r3 = r7.f32389a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r8)     // Catch:{ SQLiteException -> 0x00ba }
            r3.mo24210c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x00ba:
            r8 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8 = move-exception
            goto L_0x00d7
        L_0x00be:
            r8 = move-exception
            r1 = r0
        L_0x00c0:
            com.google.android.gms.measurement.internal.j4 r2 = r7.f32389a     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo24209b(r3, r8)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
            r1.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r8 = move-exception
            r0 = r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r0.close()
        L_0x00dc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7414l.mo24473Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0119 A[Catch:{ SQLiteException -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x011d A[Catch:{ SQLiteException -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0151 A[Catch:{ SQLiteException -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x016d A[Catch:{ SQLiteException -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0170 A[Catch:{ SQLiteException -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x017f A[Catch:{ SQLiteException -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c2 A[Catch:{ SQLiteException -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01fc  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C7431m5 mo24474R(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            p033d5.C4141r.m28217g(r35)
            r34.mo24189f()
            r34.mo24623g()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r34.mo24472P()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01db }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String r33 = "session_stitching_token"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01db }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01db }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01db }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01db }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01d9 }
            if (r5 != 0) goto L_0x006b
            r4.close()
            return r3
        L_0x006b:
            com.google.android.gms.measurement.internal.m5 r5 = new com.google.android.gms.measurement.internal.m5     // Catch:{ SQLiteException -> 0x01d9 }
            com.google.android.gms.measurement.internal.a9 r6 = r1.f32873b     // Catch:{ SQLiteException -> 0x01d9 }
            com.google.android.gms.measurement.internal.j4 r6 = r6.mo24120c0()     // Catch:{ SQLiteException -> 0x01d9 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x01d9 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24553h(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24571w(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24518F(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24514B(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24515C(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24574z(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24557j(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24555i(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24572x(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24567s(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            if (r7 != 0) goto L_0x00d7
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            if (r6 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r6 = 0
            goto L_0x00d8
        L_0x00d7:
            r6 = 1
        L_0x00d8:
            r5.mo24516D(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24566r(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24564p(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24563o(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24561m(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24560l(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24569u(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            if (r7 == 0) goto L_0x011d
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0122
        L_0x011d:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01d9 }
        L_0x0122:
            r5.mo24559k(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24570v(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24562n(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24565q(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24573y(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r6 = 23
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            if (r7 != 0) goto L_0x0159
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            if (r6 == 0) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r0 = 0
        L_0x0159:
            r5.mo24551g(r0)     // Catch:{ SQLiteException -> 0x01d9 }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24549f(r0)     // Catch:{ SQLiteException -> 0x01d9 }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01d9 }
            if (r6 == 0) goto L_0x0170
            r6 = 0
            goto L_0x0174
        L_0x0170:
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x01d9 }
        L_0x0174:
            r5.mo24568t(r6)     // Catch:{ SQLiteException -> 0x01d9 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01d9 }
            if (r6 != 0) goto L_0x0191
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01d9 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01d9 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24519G(r0)     // Catch:{ SQLiteException -> 0x01d9 }
        L_0x0191:
            com.google.android.gms.internal.measurement.C7016ie.m40214b()     // Catch:{ SQLiteException -> 0x01d9 }
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteException -> 0x01d9 }
            com.google.android.gms.measurement.internal.h r0 = r0.mo24443z()     // Catch:{ SQLiteException -> 0x01d9 }
            com.google.android.gms.measurement.internal.t2 r6 = com.google.android.gms.measurement.internal.C7516u2.f33065n0     // Catch:{ SQLiteException -> 0x01d9 }
            boolean r0 = r0.mo24279B(r3, r6)     // Catch:{ SQLiteException -> 0x01d9 }
            if (r0 == 0) goto L_0x01b9
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteException -> 0x01d9 }
            com.google.android.gms.measurement.internal.h r0 = r0.mo24443z()     // Catch:{ SQLiteException -> 0x01d9 }
            com.google.android.gms.measurement.internal.t2 r6 = com.google.android.gms.measurement.internal.C7516u2.f33069p0     // Catch:{ SQLiteException -> 0x01d9 }
            boolean r0 = r0.mo24279B(r2, r6)     // Catch:{ SQLiteException -> 0x01d9 }
            if (r0 == 0) goto L_0x01b9
            r0 = 28
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01d9 }
            r5.mo24520H(r0)     // Catch:{ SQLiteException -> 0x01d9 }
        L_0x01b9:
            r5.mo24545d()     // Catch:{ SQLiteException -> 0x01d9 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01d9 }
            if (r0 == 0) goto L_0x01d5
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteException -> 0x01d9 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteException -> 0x01d9 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ SQLiteException -> 0x01d9 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r35)     // Catch:{ SQLiteException -> 0x01d9 }
            r0.mo24209b(r6, r7)     // Catch:{ SQLiteException -> 0x01d9 }
        L_0x01d5:
            r4.close()
            return r5
        L_0x01d9:
            r0 = move-exception
            goto L_0x01df
        L_0x01db:
            r0 = move-exception
            goto L_0x01fa
        L_0x01dd:
            r0 = move-exception
            r4 = r3
        L_0x01df:
            com.google.android.gms.measurement.internal.j4 r5 = r1.f32389a     // Catch:{ all -> 0x01f8 }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ all -> 0x01f8 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x01f8 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r35)     // Catch:{ all -> 0x01f8 }
            r5.mo24210c(r6, r2, r0)     // Catch:{ all -> 0x01f8 }
            if (r4 == 0) goto L_0x01f7
            r4.close()
        L_0x01f7:
            return r3
        L_0x01f8:
            r0 = move-exception
            r3 = r4
        L_0x01fa:
            if (r3 == 0) goto L_0x01ff
            r3.close()
        L_0x01ff:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7414l.mo24474R(java.lang.String):com.google.android.gms.measurement.internal.m5");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0126  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C7326d mo24475S(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            p033d5.C4141r.m28217g(r31)
            p033d5.C4141r.m28217g(r32)
            r30.mo24189f()
            r30.mo24623g()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo24472P()     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = ""
        L_0x0057:
            r17 = r4
            java.lang.Object r6 = r1.mo24480Y(r10, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r0 == 0) goto L_0x0066
            r21 = 1
            goto L_0x0068
        L_0x0066:
            r21 = 0
        L_0x0068:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.a9 r0 = r1.f32873b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.c9 r0 = r0.mo24127g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.v> r3 = com.google.android.gms.measurement.internal.C7524v.CREATOR     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo24206z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r23 = r0
            com.google.android.gms.measurement.internal.v r23 = (com.google.android.gms.measurement.internal.C7524v) r23     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.a9 r0 = r1.f32873b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.c9 r0 = r0.mo24127g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo24206z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r26 = r0
            com.google.android.gms.measurement.internal.v r26 = (com.google.android.gms.measurement.internal.C7524v) r26     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.a9 r0 = r1.f32873b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.c9 r0 = r0.mo24127g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo24206z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r29 = r0
            com.google.android.gms.measurement.internal.v r29 = (com.google.android.gms.measurement.internal.C7524v) r29     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.d9 r18 = new com.google.android.gms.measurement.internal.d9     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.d r0 = new com.google.android.gms.measurement.internal.d     // Catch:{ SQLiteException -> 0x00f9 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r31)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.j4 r5 = r1.f32389a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.a3 r5 = r5.mo24414D()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = r5.mo24097f(r8)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.mo24210c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00f5:
            r10.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            goto L_0x0124
        L_0x00fd:
            r0 = move-exception
            r10 = r9
        L_0x00ff:
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r31)     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.j4 r5 = r1.f32389a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.a3 r5 = r5.mo24414D()     // Catch:{ all -> 0x0122 }
            java.lang.String r5 = r5.mo24097f(r8)     // Catch:{ all -> 0x0122 }
            r2.mo24211d(r3, r4, r5, r0)     // Catch:{ all -> 0x0122 }
            if (r10 == 0) goto L_0x0121
            r10.close()
        L_0x0121:
            return r9
        L_0x0122:
            r0 = move-exception
            r9 = r10
        L_0x0124:
            if (r9 == 0) goto L_0x0129
            r9.close()
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7414l.mo24475S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    /* renamed from: T */
    public final C7392j mo24476T(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo24477U(j, str, 1, false, false, z3, false, z5);
    }

    /* renamed from: U */
    public final C7392j mo24477U(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C4141r.m28217g(str);
        mo24189f();
        mo24623g();
        String[] strArr = {str};
        C7392j jVar = new C7392j();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo24472P();
            cursor = P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f32389a.mo24135l().mo24261w().mo24209b("Not updating daily counts, app is not known. appId", C7352f3.m41475z(str));
                cursor.close();
                return jVar;
            }
            if (cursor.getLong(0) == j) {
                jVar.f32594b = cursor.getLong(1);
                jVar.f32593a = cursor.getLong(2);
                jVar.f32595c = cursor.getLong(3);
                jVar.f32596d = cursor.getLong(4);
                jVar.f32597e = cursor.getLong(5);
            }
            if (z) {
                jVar.f32594b += j2;
            }
            if (z2) {
                jVar.f32593a += j2;
            }
            if (z3) {
                jVar.f32595c += j2;
            }
            if (z4) {
                jVar.f32596d += j2;
            }
            if (z5) {
                jVar.f32597e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(jVar.f32593a));
            contentValues.put("daily_events_count", Long.valueOf(jVar.f32594b));
            contentValues.put("daily_conversions_count", Long.valueOf(jVar.f32595c));
            contentValues.put("daily_error_events_count", Long.valueOf(jVar.f32596d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f32597e));
            P.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return jVar;
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24210c("Error updating daily counts. appId", C7352f3.m41475z(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return jVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C7480r mo24478V(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            p033d5.C4141r.m28217g(r28)
            p033d5.C4141r.m28217g(r29)
            r27.mo24189f()
            r27.mo24623g()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo24472P()     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = 1
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r9 = r2
        L_0x00dc:
            com.google.android.gms.measurement.internal.r r24 = new com.google.android.gms.measurement.internal.r     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r28)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            r0.mo24209b(r2, r3)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
        L_0x010d:
            r25.close()
            return r24
        L_0x0111:
            r0 = move-exception
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            r25 = r13
        L_0x0118:
            r19 = r25
            goto L_0x014e
        L_0x011b:
            r0 = move-exception
            r25 = r13
        L_0x011e:
            r13 = r25
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            goto L_0x014e
        L_0x0123:
            r0 = move-exception
            r13 = r19
        L_0x0126:
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r28)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.j4 r5 = r1.f32389a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.a3 r5 = r5.mo24414D()     // Catch:{ all -> 0x014b }
            r6 = r29
            java.lang.String r5 = r5.mo24095d(r6)     // Catch:{ all -> 0x014b }
            r2.mo24211d(r3, r4, r5, r0)     // Catch:{ all -> 0x014b }
            if (r13 == 0) goto L_0x014a
            r13.close()
        L_0x014a:
            return r19
        L_0x014b:
            r0 = move-exception
            r19 = r13
        L_0x014e:
            if (r19 == 0) goto L_0x0153
            r19.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7414l.mo24478V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.r");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C7358f9 mo24479X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            p033d5.C4141r.m28217g(r20)
            p033d5.C4141r.m28217g(r21)
            r19.mo24189f()
            r19.mo24623g()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo24472P()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.Object r8 = r1.mo24480Y(r11, r3)     // Catch:{ SQLiteException -> 0x0079 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.f9 r0 = new com.google.android.gms.measurement.internal.f9     // Catch:{ SQLiteException -> 0x0079 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r2 == 0) goto L_0x0075
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r20)     // Catch:{ SQLiteException -> 0x0079 }
            r2.mo24209b(r3, r4)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0075:
            r11.close()
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            goto L_0x00a4
        L_0x007d:
            r0 = move-exception
            r11 = r10
        L_0x007f:
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r20)     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.j4 r5 = r1.f32389a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.a3 r5 = r5.mo24414D()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.mo24097f(r9)     // Catch:{ all -> 0x00a2 }
            r2.mo24211d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a2 }
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            return r10
        L_0x00a2:
            r0 = move-exception
            r10 = r11
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r10.close()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7414l.mo24479X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.f9");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final Object mo24480Y(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f32389a.mo24135l().mo24256q().mo24208a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f32389a.mo24135l().mo24256q().mo24209b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f32389a.mo24135l().mo24256q().mo24208a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo24481Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo24472P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003e
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            com.google.android.gms.measurement.internal.j4 r3 = r6.f32389a     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo24209b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7414l.mo24481Z():java.lang.String");
    }

    /* renamed from: a0 */
    public final List mo24482a0(String str, String str2, String str3) {
        C4141r.m28217g(str);
        mo24189f();
        mo24623g();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo24483b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: b0 */
    public final List mo24483b0(String str, String[] strArr) {
        mo24189f();
        mo24623g();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo24472P();
            String[] strArr2 = {"app_id", "origin", MediationMetaData.KEY_NAME, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            this.f32389a.mo24443z();
            Cursor query = P.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f32389a.mo24443z();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object Y = mo24480Y(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        C7325c9 g0 = this.f32873b.mo24127g0();
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator<C7524v> creator = C7524v.CREATOR;
                        arrayList.add(new C7326d(string, string2, new C7336d9(string3, query.getLong(10), Y, string2), query.getLong(8), z, string4, (C7524v) g0.mo24206z(blob, creator), j, (C7524v) this.f32873b.mo24127g0().mo24206z(query.getBlob(9), creator), query.getLong(11), (C7524v) this.f32873b.mo24127g0().mo24206z(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        C7330d3 q = this.f32389a.mo24135l().mo24256q();
                        this.f32389a.mo24443z();
                        q.mo24209b("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(AdError.NETWORK_ERROR_CODE));
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24209b("Error querying conditional user property value", e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c0 */
    public final List mo24484c0(String str) {
        C4141r.m28217g(str);
        mo24189f();
        mo24623g();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f32389a.mo24443z();
            Cursor query = mo24472P().query("user_attributes", new String[]{MediationMetaData.KEY_NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object Y = mo24480Y(query, 3);
                    if (Y == null) {
                        this.f32389a.mo24135l().mo24256q().mo24209b("Read invalid user property value, ignoring it. appId", C7352f3.m41475z(str));
                    } else {
                        arrayList.add(new C7358f9(str, str2, string, j, Y));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24210c("Error querying user properties. appId", C7352f3.m41475z(str), e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124 A[DONT_GENERATE] */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo24485d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            p033d5.C4141r.m28217g(r18)
            r17.mo24189f()
            r17.mo24623g()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0106 }
            r13 = 3
            r3.<init>(r13)     // Catch:{ SQLiteException -> 0x0106 }
            r14 = r18
            r3.add(r14)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x0104 }
            boolean r5 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x0104 }
            if (r5 != 0) goto L_0x0038
            r15 = r19
            r3.add(r15)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x003a
        L_0x0038:
            r15 = r19
        L_0x003a:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x0100 }
            if (r5 != 0) goto L_0x0059
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0100 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0100 }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r6 = "*"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0100 }
            r3.add(r5)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0100 }
        L_0x0059:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ SQLiteException -> 0x0100 }
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ SQLiteException -> 0x0100 }
            android.database.sqlite.SQLiteDatabase r3 = r17.mo24472P()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = "user_attributes"
            java.lang.String r6 = "name"
            java.lang.String r8 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r10 = "origin"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r9, r10}     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r8 = r4.toString()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r10 = "rowid"
            com.google.android.gms.measurement.internal.j4 r4 = r1.f32389a     // Catch:{ SQLiteException -> 0x0100 }
            r4.mo24443z()     // Catch:{ SQLiteException -> 0x0100 }
            r9 = 0
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r16
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0100 }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0100 }
            if (r3 != 0) goto L_0x009a
            r12.close()
            return r2
        L_0x009a:
            int r3 = r2.size()     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.j4 r4 = r1.f32389a     // Catch:{ SQLiteException -> 0x0100 }
            r4.mo24443z()     // Catch:{ SQLiteException -> 0x0100 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00c0
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.j4 r5 = r1.f32389a     // Catch:{ SQLiteException -> 0x0100 }
            r5.mo24443z()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0100 }
            r0.mo24209b(r3, r4)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x00fc
        L_0x00c0:
            r3 = 0
            java.lang.String r7 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x0100 }
            r3 = 1
            long r8 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x0100 }
            r3 = 2
            java.lang.Object r10 = r1.mo24480Y(r12, r3)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r15 = r12.getString(r13)     // Catch:{ SQLiteException -> 0x0100 }
            if (r10 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.j4 r3 = r1.f32389a     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r18)     // Catch:{ SQLiteException -> 0x0100 }
            r3.mo24211d(r4, r5, r15, r0)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x00f5
        L_0x00e9:
            com.google.android.gms.measurement.internal.f9 r3 = new com.google.android.gms.measurement.internal.f9     // Catch:{ SQLiteException -> 0x0100 }
            r4 = r3
            r5 = r18
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0100 }
            r2.add(r3)     // Catch:{ SQLiteException -> 0x0100 }
        L_0x00f5:
            boolean r3 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0100 }
            if (r3 == 0) goto L_0x00fc
            goto L_0x009a
        L_0x00fc:
            r12.close()
            return r2
        L_0x0100:
            r0 = move-exception
            goto L_0x010b
        L_0x0102:
            r0 = move-exception
            goto L_0x0128
        L_0x0104:
            r0 = move-exception
            goto L_0x0109
        L_0x0106:
            r0 = move-exception
            r14 = r18
        L_0x0109:
            r15 = r19
        L_0x010b:
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a     // Catch:{ all -> 0x0102 }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x0102 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x0102 }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r18)     // Catch:{ all -> 0x0102 }
            r2.mo24211d(r3, r4, r15, r0)     // Catch:{ all -> 0x0102 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0102 }
            if (r12 == 0) goto L_0x0127
            r12.close()
        L_0x0127:
            return r0
        L_0x0128:
            if (r12 == 0) goto L_0x012d
            r12.close()
        L_0x012d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7414l.mo24485d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: e0 */
    public final void mo24486e0() {
        mo24623g();
        mo24472P().beginTransaction();
    }

    /* renamed from: f0 */
    public final void mo24487f0() {
        mo24623g();
        mo24472P().endTransaction();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final void mo24488g0(List list) {
        mo24189f();
        mo24623g();
        C4141r.m28221k(list);
        C4141r.m28223m(list.size());
        if (mo24498u()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (m41714I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                this.f32389a.mo24135l().mo24261w().mo24208a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                mo24472P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.f32389a.mo24135l().mo24256q().mo24209b("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final void mo24489h0() {
        mo24189f();
        mo24623g();
        if (mo24498u()) {
            long a = this.f32873b.mo24124e0().f33186e.mo24604a();
            long b = this.f32389a.mo24116a().mo18371b();
            long abs = Math.abs(b - a);
            this.f32389a.mo24443z();
            if (abs > ((Long) C7516u2.f33086z.mo24669a((Object) null)).longValue()) {
                this.f32873b.mo24124e0().f33186e.mo24605b(b);
                mo24189f();
                mo24623g();
                if (mo24498u()) {
                    SQLiteDatabase P = mo24472P();
                    this.f32389a.mo24443z();
                    int delete = P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f32389a.mo24116a().mo18370a()), String.valueOf(C7370h.m41498g())});
                    if (delete > 0) {
                        this.f32389a.mo24135l().mo24260v().mo24209b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo24151j() {
        return false;
    }

    /* renamed from: k */
    public final void mo24490k(String str, String str2) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        mo24189f();
        mo24623g();
        try {
            mo24472P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24211d("Error deleting user property. appId", C7352f3.m41475z(str), this.f32389a.mo24414D().mo24097f(str2), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0333, code lost:
        r11.put("session_scoped", r0);
        r11.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0347, code lost:
        if (mo24472P().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0349, code lost:
        r1.f32389a.mo24135l().mo24256q().mo24209b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C7352f3.m41475z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x035d, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0361, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r1.f32389a.mo24135l().mo24256q().mo24210c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C7352f3.m41475z(r24), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03ac, code lost:
        r3 = r25;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017a, code lost:
        r11 = r0.mo23408J().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0186, code lost:
        if (r11.hasNext() == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0192, code lost:
        if (((com.google.android.gms.internal.measurement.C7133q3) r11.next()).mo23746L() != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0194, code lost:
        r1.f32389a.mo24135l().mo24261w().mo24210c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C7352f3.m41475z(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ad, code lost:
        r11 = r0.mo23407I().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c3, code lost:
        if (r11.hasNext() == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r12 = (com.google.android.gms.internal.measurement.C6989h3) r11.next();
        mo24623g();
        mo24189f();
        p033d5.C4141r.m28217g(r24);
        p033d5.C4141r.m28221k(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01df, code lost:
        if (r12.mo23465I().isEmpty() == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e1, code lost:
        r0 = r1.f32389a.mo24135l().mo24261w();
        r9 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f9, code lost:
        if (r12.mo23471Q() == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01fb, code lost:
        r20 = java.lang.Integer.valueOf(r12.mo23462D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0206, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0208, code lost:
        r0.mo24211d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0213, code lost:
        r3 = r12.mo23736h();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r2);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022c, code lost:
        if (r12.mo23471Q() == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x022e, code lost:
        r9 = java.lang.Integer.valueOf(r12.mo23462D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0237, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0238, code lost:
        r7.put("filter_id", r9);
        r7.put("event_name", r12.mo23465I());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0248, code lost:
        if (r12.mo23472R() == false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x024a, code lost:
        r9 = java.lang.Boolean.valueOf(r12.mo23469O());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0253, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0254, code lost:
        r7.put("session_scoped", r9);
        r7.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0268, code lost:
        if (mo24472P().insertWithOnConflict("event_filters", (java.lang.String) null, r7, 5) != -1) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x026a, code lost:
        r1.f32389a.mo24135l().mo24256q().mo24209b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C7352f3.m41475z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x027d, code lost:
        r3 = r25;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0299, code lost:
        r21 = r7;
        r0 = r0.mo23408J().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02a7, code lost:
        if (r0.hasNext() == false) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a9, code lost:
        r3 = (com.google.android.gms.internal.measurement.C7133q3) r0.next();
        mo24623g();
        mo24189f();
        p033d5.C4141r.m28217g(r24);
        p033d5.C4141r.m28221k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02c3, code lost:
        if (r3.mo23742G().isEmpty() == false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02c5, code lost:
        r0 = r1.f32389a.mo24135l().mo24261w();
        r8 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02dd, code lost:
        if (r3.mo23746L() == false) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02df, code lost:
        r3 = java.lang.Integer.valueOf(r3.mo23740C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02e8, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02e9, code lost:
        r0.mo24211d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02f2, code lost:
        r7 = r3.mo23736h();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r2);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0309, code lost:
        if (r3.mo23746L() == false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x030b, code lost:
        r12 = java.lang.Integer.valueOf(r3.mo23740C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0314, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0315, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.mo23742G());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0327, code lost:
        if (r3.mo23747M() == false) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0329, code lost:
        r0 = java.lang.Boolean.valueOf(r3.mo23745K());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0332, code lost:
        r0 = null;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24491m(java.lang.String r24, java.util.List r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            p033d5.C4141r.m28221k(r25)
            r8 = 0
        L_0x0012:
            int r9 = r25.size()
            if (r8 >= r9) goto L_0x00dc
            java.lang.Object r9 = r3.get(r8)
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.C6955f3) r9
            com.google.android.gms.internal.measurement.e9 r9 = r9.mo23501z()
            com.google.android.gms.internal.measurement.e3 r9 = (com.google.android.gms.internal.measurement.C6938e3) r9
            int r11 = r9.mo23344p()
            if (r11 == 0) goto L_0x009d
            r11 = 0
        L_0x002b:
            int r12 = r9.mo23344p()
            if (r11 >= r12) goto L_0x009d
            com.google.android.gms.internal.measurement.h3 r12 = r9.mo23348v(r11)
            com.google.android.gms.internal.measurement.e9 r12 = r12.mo23501z()
            com.google.android.gms.internal.measurement.g3 r12 = (com.google.android.gms.internal.measurement.C6972g3) r12
            com.google.android.gms.internal.measurement.e9 r13 = r12.clone()
            com.google.android.gms.internal.measurement.g3 r13 = (com.google.android.gms.internal.measurement.C6972g3) r13
            java.lang.String r14 = r12.mo23427v()
            java.lang.String r14 = p402y5.C13039q.m61355b(r14)
            if (r14 == 0) goto L_0x0050
            r13.mo23424r(r14)
            r14 = 1
            goto L_0x0051
        L_0x0050:
            r14 = 0
        L_0x0051:
            r15 = 0
        L_0x0052:
            int r7 = r12.mo23423p()
            if (r15 >= r7) goto L_0x0088
            com.google.android.gms.internal.measurement.j3 r7 = r12.mo23426u(r15)
            java.lang.String r10 = r7.mo23547G()
            r16 = r12
            java.lang.String[] r12 = p402y5.C13040r.f47290a
            r17 = r4
            java.lang.String[] r4 = p402y5.C13040r.f47291b
            java.lang.String r4 = p402y5.C13046x.m61371a(r10, r12, r4)
            if (r4 == 0) goto L_0x0081
            com.google.android.gms.internal.measurement.e9 r7 = r7.mo23501z()
            com.google.android.gms.internal.measurement.i3 r7 = (com.google.android.gms.internal.measurement.C7005i3) r7
            r7.mo23519p(r4)
            com.google.android.gms.internal.measurement.h9 r4 = r7.mo23357k()
            com.google.android.gms.internal.measurement.j3 r4 = (com.google.android.gms.internal.measurement.C7021j3) r4
            r13.mo23425s(r15, r4)
            r14 = 1
        L_0x0081:
            int r15 = r15 + 1
            r12 = r16
            r4 = r17
            goto L_0x0052
        L_0x0088:
            r17 = r4
            if (r14 == 0) goto L_0x0098
            r9.mo23346s(r11, r13)
            com.google.android.gms.internal.measurement.h9 r4 = r9.mo23357k()
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.C6955f3) r4
            r3.set(r8, r4)
        L_0x0098:
            int r11 = r11 + 1
            r4 = r17
            goto L_0x002b
        L_0x009d:
            r17 = r4
            int r4 = r9.mo23345r()
            if (r4 == 0) goto L_0x00d6
            r4 = 0
        L_0x00a6:
            int r7 = r9.mo23345r()
            if (r4 >= r7) goto L_0x00d6
            com.google.android.gms.internal.measurement.q3 r7 = r9.mo23349x(r4)
            java.lang.String r10 = r7.mo23742G()
            java.lang.String[] r11 = p402y5.C13041s.f47294a
            java.lang.String[] r12 = p402y5.C13041s.f47295b
            java.lang.String r10 = p402y5.C13046x.m61371a(r10, r11, r12)
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.internal.measurement.e9 r7 = r7.mo23501z()
            com.google.android.gms.internal.measurement.p3 r7 = (com.google.android.gms.internal.measurement.C7117p3) r7
            r7.mo23731p(r10)
            r9.mo23347u(r4, r7)
            com.google.android.gms.internal.measurement.h9 r7 = r9.mo23357k()
            com.google.android.gms.internal.measurement.f3 r7 = (com.google.android.gms.internal.measurement.C6955f3) r7
            r3.set(r8, r7)
        L_0x00d3:
            int r4 = r4 + 1
            goto L_0x00a6
        L_0x00d6:
            int r8 = r8 + 1
            r4 = r17
            goto L_0x0012
        L_0x00dc:
            r17 = r4
            r23.mo24623g()
            r23.mo24189f()
            p033d5.C4141r.m28217g(r24)
            p033d5.C4141r.m28221k(r25)
            android.database.sqlite.SQLiteDatabase r4 = r23.mo24472P()
            r4.beginTransaction()
            r23.mo24623g()     // Catch:{ all -> 0x0495 }
            r23.mo24189f()     // Catch:{ all -> 0x0495 }
            p033d5.C4141r.m28217g(r24)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r7 = r23.mo24472P()     // Catch:{ all -> 0x0495 }
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x0495 }
            r10 = 0
            r9[r10] = r2     // Catch:{ all -> 0x0495 }
            r7.delete(r6, r0, r9)     // Catch:{ all -> 0x0495 }
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x0495 }
            r9[r10] = r2     // Catch:{ all -> 0x0495 }
            r7.delete(r5, r0, r9)     // Catch:{ all -> 0x0495 }
            java.util.Iterator r7 = r25.iterator()     // Catch:{ all -> 0x0495 }
        L_0x0112:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x03b2
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.f3 r0 = (com.google.android.gms.internal.measurement.C6955f3) r0     // Catch:{ all -> 0x0495 }
            r23.mo24623g()     // Catch:{ all -> 0x0495 }
            r23.mo24189f()     // Catch:{ all -> 0x0495 }
            p033d5.C4141r.m28217g(r24)     // Catch:{ all -> 0x0495 }
            p033d5.C4141r.m28221k(r0)     // Catch:{ all -> 0x0495 }
            boolean r10 = r0.mo23409M()     // Catch:{ all -> 0x0495 }
            if (r10 != 0) goto L_0x0144
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Audience with no ID. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24)     // Catch:{ all -> 0x0495 }
            r0.mo24209b(r8, r9)     // Catch:{ all -> 0x0495 }
            goto L_0x0112
        L_0x0144:
            int r10 = r0.mo23402C()     // Catch:{ all -> 0x0495 }
            java.util.List r11 = r0.mo23407I()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0495 }
        L_0x0150:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0495 }
            if (r12 == 0) goto L_0x017a
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.h3 r12 = (com.google.android.gms.internal.measurement.C6989h3) r12     // Catch:{ all -> 0x0495 }
            boolean r12 = r12.mo23471Q()     // Catch:{ all -> 0x0495 }
            if (r12 != 0) goto L_0x0150
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r0.mo24210c(r8, r9, r10)     // Catch:{ all -> 0x0495 }
            goto L_0x0112
        L_0x017a:
            java.util.List r11 = r0.mo23408J()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0495 }
        L_0x0182:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0495 }
            if (r12 == 0) goto L_0x01ad
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.q3 r12 = (com.google.android.gms.internal.measurement.C7133q3) r12     // Catch:{ all -> 0x0495 }
            boolean r12 = r12.mo23746L()     // Catch:{ all -> 0x0495 }
            if (r12 != 0) goto L_0x0182
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r0.mo24210c(r8, r9, r10)     // Catch:{ all -> 0x0495 }
            goto L_0x0112
        L_0x01ad:
            java.util.List r11 = r0.mo23407I()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0495 }
        L_0x01b5:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r9 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L_0x0299
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.h3 r12 = (com.google.android.gms.internal.measurement.C6989h3) r12     // Catch:{ all -> 0x0495 }
            r23.mo24623g()     // Catch:{ all -> 0x0495 }
            r23.mo24189f()     // Catch:{ all -> 0x0495 }
            p033d5.C4141r.m28217g(r24)     // Catch:{ all -> 0x0495 }
            p033d5.C4141r.m28221k(r12)     // Catch:{ all -> 0x0495 }
            java.lang.String r21 = r12.mo23465I()     // Catch:{ all -> 0x0495 }
            boolean r21 = r21.isEmpty()     // Catch:{ all -> 0x0495 }
            if (r21 == 0) goto L_0x0213
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            boolean r13 = r12.mo23471Q()     // Catch:{ all -> 0x0495 }
            if (r13 == 0) goto L_0x0206
            int r12 = r12.mo23462D()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0495 }
            r20 = r12
            goto L_0x0208
        L_0x0206:
            r20 = 0
        L_0x0208:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x0495 }
            r0.mo24211d(r8, r9, r11, r12)     // Catch:{ all -> 0x0495 }
            r21 = r7
            goto L_0x0375
        L_0x0213:
            byte[] r3 = r12.mo23736h()     // Catch:{ all -> 0x0495 }
            r21 = r7
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0495 }
            r7.<init>()     // Catch:{ all -> 0x0495 }
            r7.put(r15, r2)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r7.put(r9, r15)     // Catch:{ all -> 0x0495 }
            boolean r9 = r12.mo23471Q()     // Catch:{ all -> 0x0495 }
            if (r9 == 0) goto L_0x0237
            int r9 = r12.mo23462D()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0495 }
            goto L_0x0238
        L_0x0237:
            r9 = 0
        L_0x0238:
            r7.put(r14, r9)     // Catch:{ all -> 0x0495 }
            java.lang.String r9 = "event_name"
            java.lang.String r14 = r12.mo23465I()     // Catch:{ all -> 0x0495 }
            r7.put(r9, r14)     // Catch:{ all -> 0x0495 }
            boolean r9 = r12.mo23472R()     // Catch:{ all -> 0x0495 }
            if (r9 == 0) goto L_0x0253
            boolean r9 = r12.mo23469O()     // Catch:{ all -> 0x0495 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0495 }
            goto L_0x0254
        L_0x0253:
            r9 = 0
        L_0x0254:
            r7.put(r13, r9)     // Catch:{ all -> 0x0495 }
            r7.put(r8, r3)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo24472P()     // Catch:{ SQLiteException -> 0x0283 }
            r8 = 5
            r9 = 0
            long r7 = r3.insertWithOnConflict(r5, r9, r7, r8)     // Catch:{ SQLiteException -> 0x0283 }
            r12 = -1
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x027d
            com.google.android.gms.measurement.internal.j4 r3 = r1.f32389a     // Catch:{ SQLiteException -> 0x0283 }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ SQLiteException -> 0x0283 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ SQLiteException -> 0x0283 }
            java.lang.String r7 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24)     // Catch:{ SQLiteException -> 0x0283 }
            r3.mo24209b(r7, r8)     // Catch:{ SQLiteException -> 0x0283 }
        L_0x027d:
            r3 = r25
            r7 = r21
            goto L_0x01b5
        L_0x0283:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j4 r3 = r1.f32389a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = "Error storing event filter. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24)     // Catch:{ all -> 0x0495 }
            r3.mo24210c(r7, r8, r0)     // Catch:{ all -> 0x0495 }
            goto L_0x0375
        L_0x0299:
            r21 = r7
            java.util.List r0 = r0.mo23408J()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0495 }
        L_0x02a3:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0495 }
            if (r3 == 0) goto L_0x03ac
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.q3 r3 = (com.google.android.gms.internal.measurement.C7133q3) r3     // Catch:{ all -> 0x0495 }
            r23.mo24623g()     // Catch:{ all -> 0x0495 }
            r23.mo24189f()     // Catch:{ all -> 0x0495 }
            p033d5.C4141r.m28217g(r24)     // Catch:{ all -> 0x0495 }
            p033d5.C4141r.m28221k(r3)     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = r3.mo23742G()     // Catch:{ all -> 0x0495 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0495 }
            if (r7 == 0) goto L_0x02f2
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            boolean r11 = r3.mo23746L()     // Catch:{ all -> 0x0495 }
            if (r11 == 0) goto L_0x02e8
            int r3 = r3.mo23740C()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0495 }
            goto L_0x02e9
        L_0x02e8:
            r3 = 0
        L_0x02e9:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0495 }
            r0.mo24211d(r7, r8, r9, r3)     // Catch:{ all -> 0x0495 }
            goto L_0x0375
        L_0x02f2:
            byte[] r7 = r3.mo23736h()     // Catch:{ all -> 0x0495 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0495 }
            r11.<init>()     // Catch:{ all -> 0x0495 }
            r11.put(r15, r2)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r11.put(r9, r12)     // Catch:{ all -> 0x0495 }
            boolean r12 = r3.mo23746L()     // Catch:{ all -> 0x0495 }
            if (r12 == 0) goto L_0x0314
            int r12 = r3.mo23740C()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0495 }
            goto L_0x0315
        L_0x0314:
            r12 = 0
        L_0x0315:
            r11.put(r14, r12)     // Catch:{ all -> 0x0495 }
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.mo23742G()     // Catch:{ all -> 0x0495 }
            r11.put(r12, r0)     // Catch:{ all -> 0x0495 }
            boolean r0 = r3.mo23747M()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x0332
            boolean r0 = r3.mo23745K()     // Catch:{ all -> 0x0495 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0495 }
            goto L_0x0333
        L_0x0332:
            r0 = 0
        L_0x0333:
            r11.put(r13, r0)     // Catch:{ all -> 0x0495 }
            r11.put(r8, r7)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo24472P()     // Catch:{ SQLiteException -> 0x0361 }
            r3 = 0
            r7 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r7)     // Catch:{ SQLiteException -> 0x0361 }
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x035d
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteException -> 0x0361 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteException -> 0x0361 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ SQLiteException -> 0x0361 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24)     // Catch:{ SQLiteException -> 0x0361 }
            r0.mo24209b(r3, r7)     // Catch:{ SQLiteException -> 0x0361 }
            goto L_0x0375
        L_0x035d:
            r0 = r22
            goto L_0x02a3
        L_0x0361:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j4 r3 = r1.f32389a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = "Error storing property filter. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24)     // Catch:{ all -> 0x0495 }
            r3.mo24210c(r7, r8, r0)     // Catch:{ all -> 0x0495 }
        L_0x0375:
            r23.mo24623g()     // Catch:{ all -> 0x0495 }
            r23.mo24189f()     // Catch:{ all -> 0x0495 }
            p033d5.C4141r.m28217g(r24)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo24472P()     // Catch:{ all -> 0x0495 }
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x0495 }
            r3 = 0
            r7[r3] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r8 = 1
            r7[r8] = r3     // Catch:{ all -> 0x0495 }
            r3 = r17
            r0.delete(r6, r3, r7)     // Catch:{ all -> 0x0495 }
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x0495 }
            r8 = 0
            r7[r8] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r9 = 1
            r7[r9] = r8     // Catch:{ all -> 0x0495 }
            r0.delete(r5, r3, r7)     // Catch:{ all -> 0x0495 }
            r17 = r3
            r7 = r21
            r3 = r25
            goto L_0x0112
        L_0x03ac:
            r3 = r25
            r7 = r21
            goto L_0x0112
        L_0x03b2:
            r3 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0495 }
            r0.<init>()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r5 = r25.iterator()     // Catch:{ all -> 0x0495 }
        L_0x03bc:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0495 }
            if (r6 == 0) goto L_0x03dc
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.C6955f3) r6     // Catch:{ all -> 0x0495 }
            boolean r7 = r6.mo23409M()     // Catch:{ all -> 0x0495 }
            if (r7 == 0) goto L_0x03d7
            int r6 = r6.mo23402C()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0495 }
            goto L_0x03d8
        L_0x03d7:
            r9 = r3
        L_0x03d8:
            r0.add(r9)     // Catch:{ all -> 0x0495 }
            goto L_0x03bc
        L_0x03dc:
            p033d5.C4141r.m28217g(r24)     // Catch:{ all -> 0x0495 }
            r23.mo24623g()     // Catch:{ all -> 0x0495 }
            r23.mo24189f()     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo24472P()     // Catch:{ all -> 0x0495 }
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x047a }
            r5 = 0
            r6[r5] = r2     // Catch:{ SQLiteException -> 0x047a }
            java.lang.String r5 = "select count(1) from audience_filter_values where app_id=?"
            long r5 = r1.m41714I(r5, r6)     // Catch:{ SQLiteException -> 0x047a }
            com.google.android.gms.measurement.internal.j4 r7 = r1.f32389a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.h r7 = r7.mo24443z()     // Catch:{ all -> 0x0495 }
            r8 = 2000(0x7d0, float:2.803E-42)
            com.google.android.gms.measurement.internal.t2 r9 = com.google.android.gms.measurement.internal.C7516u2.f33018G     // Catch:{ all -> 0x0495 }
            int r7 = r7.mo24290n(r2, r9)     // Catch:{ all -> 0x0495 }
            int r7 = java.lang.Math.min(r8, r7)     // Catch:{ all -> 0x0495 }
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)     // Catch:{ all -> 0x0495 }
            long r8 = (long) r7     // Catch:{ all -> 0x0495 }
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0413
            goto L_0x048e
        L_0x0413:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0495 }
            r5.<init>()     // Catch:{ all -> 0x0495 }
            r10 = 0
        L_0x0419:
            int r6 = r0.size()     // Catch:{ all -> 0x0495 }
            if (r10 >= r6) goto L_0x0435
            java.lang.Object r6 = r0.get(r10)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0495 }
            if (r6 == 0) goto L_0x048e
            int r6 = r6.intValue()     // Catch:{ all -> 0x0495 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0495 }
            r5.add(r6)     // Catch:{ all -> 0x0495 }
            int r10 = r10 + 1
            goto L_0x0419
        L_0x0435:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch:{ all -> 0x0495 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0495 }
            r5.<init>()     // Catch:{ all -> 0x0495 }
            java.lang.String r6 = "("
            r5.append(r6)     // Catch:{ all -> 0x0495 }
            r5.append(r0)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x0495 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0495 }
            r0.<init>()     // Catch:{ all -> 0x0495 }
            java.lang.String r6 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r0.append(r6)     // Catch:{ all -> 0x0495 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0495 }
            r0.append(r5)     // Catch:{ all -> 0x0495 }
            java.lang.String r5 = " order by rowid desc limit -1 offset ?)"
            r0.append(r5)     // Catch:{ all -> 0x0495 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x0495 }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r2 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0495 }
            r6 = 1
            r5[r6] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r2 = "audience_filter_values"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0495 }
            r3.delete(r2, r0, r5)     // Catch:{ all -> 0x0495 }
            goto L_0x048e
        L_0x047a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j4 r3 = r1.f32389a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()     // Catch:{ all -> 0x0495 }
            java.lang.String r5 = "Database error querying filters. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r24)     // Catch:{ all -> 0x0495 }
            r3.mo24210c(r5, r2, r0)     // Catch:{ all -> 0x0495 }
        L_0x048e:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0495 }
            r4.endTransaction()
            return
        L_0x0495:
            r0 = move-exception
            r4.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7414l.mo24491m(java.lang.String, java.util.List):void");
    }

    /* renamed from: n */
    public final void mo24492n() {
        mo24623g();
        mo24472P().setTransactionSuccessful();
    }

    /* renamed from: o */
    public final void mo24493o(C7431m5 m5Var) {
        C4141r.m28221k(m5Var);
        mo24189f();
        mo24623g();
        String d0 = m5Var.mo24546d0();
        C4141r.m28221k(d0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d0);
        contentValues.put("app_instance_id", m5Var.mo24548e0());
        contentValues.put("gmp_app_id", m5Var.mo24556i0());
        contentValues.put("resettable_device_id_hash", m5Var.mo24539a());
        contentValues.put("last_bundle_index", Long.valueOf(m5Var.mo24537Y()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(m5Var.mo24538Z()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(m5Var.mo24536X()));
        contentValues.put("app_version", m5Var.mo24552g0());
        contentValues.put("app_store", m5Var.mo24550f0());
        contentValues.put("gmp_version", Long.valueOf(m5Var.mo24535W()));
        contentValues.put("dev_cert_hash", Long.valueOf(m5Var.mo24532T()));
        contentValues.put("measurement_enabled", Boolean.valueOf(m5Var.mo24522J()));
        contentValues.put("day", Long.valueOf(m5Var.mo24531S()));
        contentValues.put("daily_public_events_count", Long.valueOf(m5Var.mo24529Q()));
        contentValues.put("daily_events_count", Long.valueOf(m5Var.mo24528P()));
        contentValues.put("daily_conversions_count", Long.valueOf(m5Var.mo24526N()));
        contentValues.put("config_fetched_time", Long.valueOf(m5Var.mo24525M()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(m5Var.mo24534V()));
        contentValues.put("app_version_int", Long.valueOf(m5Var.mo24524L()));
        contentValues.put("firebase_instance_id", m5Var.mo24554h0());
        contentValues.put("daily_error_events_count", Long.valueOf(m5Var.mo24527O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(m5Var.mo24530R()));
        contentValues.put("health_monitor_sample", m5Var.mo24558j0());
        m5Var.mo24513A();
        contentValues.put("android_id", 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(m5Var.mo24521I()));
        contentValues.put("admob_app_id", m5Var.mo24542b0());
        contentValues.put("dynamite_version", Long.valueOf(m5Var.mo24533U()));
        contentValues.put("session_stitching_token", m5Var.mo24541b());
        List c = m5Var.mo24543c();
        if (c != null) {
            if (c.isEmpty()) {
                this.f32389a.mo24135l().mo24261w().mo24209b("Safelisted events should not be an empty list. appId", d0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c));
            }
        }
        C7238wc.m41071b();
        if (this.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33059k0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase P = mo24472P();
            if (((long) P.update("apps", contentValues, "app_id = ?", new String[]{d0})) == 0 && P.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f32389a.mo24135l().mo24256q().mo24209b("Failed to insert/update app (got -1). appId", C7352f3.m41475z(d0));
            }
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24210c("Error storing app. appId", C7352f3.m41475z(d0), e);
        }
    }

    /* renamed from: p */
    public final void mo24494p(C7480r rVar) {
        C4141r.m28221k(rVar);
        mo24189f();
        mo24623g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rVar.f32911a);
        contentValues.put(MediationMetaData.KEY_NAME, rVar.f32912b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f32913c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f32914d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f32916f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.f32917g));
        contentValues.put("last_bundled_day", rVar.f32918h);
        contentValues.put("last_sampled_complex_event_id", rVar.f32919i);
        contentValues.put("last_sampling_rate", rVar.f32920j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f32915e));
        Boolean bool = rVar.f32921k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo24472P().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f32389a.mo24135l().mo24256q().mo24209b("Failed to insert/update event aggregates (got -1). appId", C7352f3.m41475z(rVar.f32911a));
            }
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24210c("Error storing event aggregates. appId", C7352f3.m41475z(rVar.f32911a), e);
        }
    }

    /* renamed from: q */
    public final boolean mo24495q() {
        return m41714I("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: r */
    public final boolean mo24496r() {
        return m41714I("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: t */
    public final boolean mo24497t() {
        return m41714I("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo24498u() {
        Context d = this.f32389a.mo24121d();
        this.f32389a.mo24443z();
        return d.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: v */
    public final boolean mo24499v(String str, Long l, long j, C7150r4 r4Var) {
        mo24189f();
        mo24623g();
        C4141r.m28221k(r4Var);
        C4141r.m28217g(str);
        C4141r.m28221k(l);
        byte[] h = r4Var.mo23736h();
        this.f32389a.mo24135l().mo24260v().mo24210c("Saving complex main event, appId, data size", this.f32389a.mo24414D().mo24095d(str), Integer.valueOf(h.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", h);
        try {
            if (mo24472P().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f32389a.mo24135l().mo24256q().mo24209b("Failed to insert complex main event (got -1). appId", C7352f3.m41475z(str));
            return false;
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24210c("Error storing complex main event. appId", C7352f3.m41475z(str), e);
            return false;
        }
    }

    /* renamed from: w */
    public final boolean mo24500w(C7326d dVar) {
        C4141r.m28221k(dVar);
        mo24189f();
        mo24623g();
        String str = dVar.f32396a;
        C4141r.m28221k(str);
        if (mo24479X(str, dVar.f32398c.f32439b) == null) {
            long I = m41714I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f32389a.mo24443z();
            if (I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", dVar.f32397b);
        contentValues.put(MediationMetaData.KEY_NAME, dVar.f32398c.f32439b);
        m41713H(contentValues, "value", C4141r.m28221k(dVar.f32398c.mo24243I1()));
        contentValues.put("active", Boolean.valueOf(dVar.f32400e));
        contentValues.put("trigger_event_name", dVar.f32401f);
        contentValues.put("trigger_timeout", Long.valueOf(dVar.f32403h));
        contentValues.put("timed_out_event", this.f32389a.mo24423N().mo24387c0(dVar.f32402g));
        contentValues.put("creation_timestamp", Long.valueOf(dVar.f32399d));
        contentValues.put("triggered_event", this.f32389a.mo24423N().mo24387c0(dVar.f32404i));
        contentValues.put("triggered_timestamp", Long.valueOf(dVar.f32398c.f32440c));
        contentValues.put("time_to_live", Long.valueOf(dVar.f32405r));
        contentValues.put("expired_event", this.f32389a.mo24423N().mo24387c0(dVar.f32406s));
        try {
            if (mo24472P().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f32389a.mo24135l().mo24256q().mo24209b("Failed to insert/update conditional user property (got -1)", C7352f3.m41475z(str));
            }
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24210c("Error storing conditional user property", C7352f3.m41475z(str), e);
        }
        return true;
    }

    /* renamed from: x */
    public final boolean mo24501x(C7358f9 f9Var) {
        C4141r.m28221k(f9Var);
        mo24189f();
        mo24623g();
        if (mo24479X(f9Var.f32489a, f9Var.f32491c) == null) {
            if (C7391i9.m41592X(f9Var.f32491c)) {
                if (m41714I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{f9Var.f32489a}) >= ((long) this.f32389a.mo24443z().mo24291o(f9Var.f32489a, C7516u2.f33019H, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(f9Var.f32491c)) {
                long I = m41714I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{f9Var.f32489a, f9Var.f32490b});
                this.f32389a.mo24443z();
                if (I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f9Var.f32489a);
        contentValues.put("origin", f9Var.f32490b);
        contentValues.put(MediationMetaData.KEY_NAME, f9Var.f32491c);
        contentValues.put("set_timestamp", Long.valueOf(f9Var.f32492d));
        m41713H(contentValues, "value", f9Var.f32493e);
        try {
            if (mo24472P().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f32389a.mo24135l().mo24256q().mo24209b("Failed to insert/update user property (got -1). appId", C7352f3.m41475z(f9Var.f32489a));
            }
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24210c("Error storing user property. appId", C7352f3.m41475z(f9Var.f32489a), e);
        }
        return true;
    }
}
