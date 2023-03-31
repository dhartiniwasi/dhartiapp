package androidx.media2.session;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.util.C0825c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p152v0.C5755b;

public final class SessionCommand implements C5755b {

    /* renamed from: d */
    static final SparseArray<List<Integer>> f3625d;

    /* renamed from: e */
    static final SparseArray<List<Integer>> f3626e;

    /* renamed from: f */
    static final SparseArray<List<Integer>> f3627f;

    /* renamed from: g */
    static final SparseArray<List<Integer>> f3628g;

    /* renamed from: h */
    static final SparseArray<List<Integer>> f3629h;

    /* renamed from: a */
    int f3630a;

    /* renamed from: b */
    String f3631b;

    /* renamed from: c */
    Bundle f3632c;

    static {
        SparseArray<List<Integer>> sparseArray = new SparseArray<>();
        f3625d = sparseArray;
        SparseArray<List<Integer>> sparseArray2 = new SparseArray<>();
        f3626e = sparseArray2;
        sparseArray.put(1, Arrays.asList(new Integer[]{10000, 10001, 10002, 10003, 10004, 11000, 11001, 11002}));
        sparseArray2.put(1, Arrays.asList(new Integer[]{10005, 10006, 10007, 10008, 10009, 10010, 10011, 10012, 10013, 10014, 10015, 10016, 10017, 10018}));
        sparseArray2.put(2, Collections.singletonList(10019));
        SparseArray<List<Integer>> sparseArray3 = new SparseArray<>();
        f3627f = sparseArray3;
        sparseArray3.put(1, Arrays.asList(new Integer[]{30000, 30001}));
        SparseArray<List<Integer>> sparseArray4 = new SparseArray<>();
        f3628g = sparseArray4;
        sparseArray4.put(1, Arrays.asList(new Integer[]{40000, 40001, 40002, 40003, 40010}));
        sparseArray4.put(2, Collections.singletonList(40011));
        SparseArray<List<Integer>> sparseArray5 = new SparseArray<>();
        f3629h = sparseArray5;
        sparseArray5.put(1, Arrays.asList(new Integer[]{50000, 50001, 50002, 50003, 50004, 50005, 50006}));
    }

    SessionCommand() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionCommand)) {
            return false;
        }
        SessionCommand sessionCommand = (SessionCommand) obj;
        if (this.f3630a != sessionCommand.f3630a || !TextUtils.equals(this.f3631b, sessionCommand.f3631b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C0825c.m3643b(this.f3631b, Integer.valueOf(this.f3630a));
    }
}
