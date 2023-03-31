package p170y0;

/* renamed from: y0.s */
/* compiled from: WorkInfo */
public enum C6110s {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* renamed from: a */
    public boolean mo20936a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
