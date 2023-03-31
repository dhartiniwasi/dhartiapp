package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.C1509R;
import androidx.window.core.ExperimentalWindowApi;
import java.util.Set;
import kotlin.jvm.internal.C11669k;

@ExperimentalWindowApi
/* compiled from: SplitRuleParser.kt */
public final class SplitRuleParser {
    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                String obj = charSequence.toString();
                if (obj.charAt(0) == '.') {
                    return new ComponentName(str, C11669k.m56792j(str, obj));
                }
                int y = C13011o.m61307y(obj, '/', 0, false, 6, (Object) null);
                if (y > 0) {
                    str = obj.substring(0, y);
                    C11669k.m56786d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    obj = obj.substring(y + 1);
                    C11669k.m56786d(obj, "(this as java.lang.String).substring(startIndex)");
                }
                if (C11669k.m56783a(obj, "*") || C13011o.m61307y(obj, '.', 0, false, 6, (Object) null) >= 0) {
                    return new ComponentName(str, obj);
                }
                return new ComponentName(str, str + '.' + obj);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C1509R.styleable.ActivityFilter, 0, 0);
        String string = obtainStyledAttributes.getString(C1509R.styleable.ActivityFilter_activityName);
        String string2 = obtainStyledAttributes.getString(C1509R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        C11669k.m56786d(packageName, "packageName");
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseSplitActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        return new ActivityRule(C10518g0.m52943b(), context.getTheme().obtainStyledAttributes(xmlResourceParser, C1509R.styleable.ActivityRule, 0, 0).getBoolean(C1509R.styleable.ActivityRule_alwaysExpand, false));
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C1509R.styleable.SplitPairFilter, 0, 0);
        String string = obtainStyledAttributes.getString(C1509R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = obtainStyledAttributes.getString(C1509R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = obtainStyledAttributes.getString(C1509R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        C11669k.m56786d(packageName, "packageName");
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C1509R.styleable.SplitPairRule, 0, 0);
        float f = obtainStyledAttributes.getFloat(C1509R.styleable.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(C1509R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C1509R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i = obtainStyledAttributes.getInt(C1509R.styleable.SplitPairRule_splitLayoutDirection, 3);
        return new SplitPairRule(C10518g0.m52943b(), obtainStyledAttributes.getBoolean(C1509R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), obtainStyledAttributes.getBoolean(C1509R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), obtainStyledAttributes.getBoolean(C1509R.styleable.SplitPairRule_clearTop, false), dimension, dimension2, f, i);
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C1509R.styleable.SplitPlaceholderRule, 0, 0);
        String string = obtainStyledAttributes.getString(C1509R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f = obtainStyledAttributes.getFloat(C1509R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(C1509R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C1509R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i = obtainStyledAttributes.getInt(C1509R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        C11669k.m56786d(packageName, "packageName");
        ComponentName buildClassName = buildClassName(packageName, string);
        Set b = C10518g0.m52943b();
        Intent component = new Intent().setComponent(buildClassName);
        C11669k.m56786d(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new SplitPlaceholderRule(b, component, dimension, dimension2, f, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r5 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set<androidx.window.embedding.EmbeddingRule> parseSplitXml(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            r1 = 0
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)     // Catch:{ NotFoundException -> 0x00f2 }
            java.lang.String r0 = "resources.getXml(splitResourceId)"
            kotlin.jvm.internal.C11669k.m56786d(r10, r0)     // Catch:{ NotFoundException -> 0x00f2 }
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r2 = r10.getDepth()
            int r3 = r10.next()
            r4 = r1
            r5 = r4
            r6 = r5
        L_0x001e:
            r7 = 1
            if (r3 == r7) goto L_0x00f1
            r7 = 3
            if (r3 != r7) goto L_0x002a
            int r3 = r10.getDepth()
            if (r3 <= r2) goto L_0x00f1
        L_0x002a:
            int r3 = r10.getEventType()
            r7 = 2
            if (r3 != r7) goto L_0x00eb
            java.lang.String r3 = r10.getName()
            java.lang.String r7 = "split-config"
            boolean r3 = kotlin.jvm.internal.C11669k.m56783a(r7, r3)
            if (r3 == 0) goto L_0x003f
            goto L_0x00eb
        L_0x003f:
            java.lang.String r3 = r10.getName()
            if (r3 == 0) goto L_0x00e5
            int r7 = r3.hashCode()
            switch(r7) {
                case 511422343: goto L_0x00b0;
                case 520447504: goto L_0x009c;
                case 1579230604: goto L_0x007a;
                case 1793077963: goto L_0x0064;
                case 2050988213: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x00e5
        L_0x004e:
            java.lang.String r7 = "SplitPlaceholderRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0058
            goto L_0x00e5
        L_0x0058:
            androidx.window.embedding.SplitPlaceholderRule r3 = r8.parseSplitPlaceholderRule(r9, r10)
            r0.add(r3)
            r4 = r1
            r5 = r4
        L_0x0061:
            r6 = r3
            goto L_0x00e5
        L_0x0064:
            java.lang.String r7 = "ActivityRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x006e
            goto L_0x00e5
        L_0x006e:
            androidx.window.embedding.ActivityRule r3 = r8.parseSplitActivityRule(r9, r10)
            r0.add(r3)
            r5 = r1
            r6 = r5
        L_0x0077:
            r4 = r3
            goto L_0x00e5
        L_0x007a:
            java.lang.String r7 = "SplitPairFilter"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0083
            goto L_0x00e5
        L_0x0083:
            if (r5 == 0) goto L_0x0094
            androidx.window.embedding.SplitPairFilter r3 = r8.parseSplitPairFilter(r9, r10)
            r0.remove(r5)
            androidx.window.embedding.SplitPairRule r3 = r5.plus$window_release(r3)
            r0.add(r3)
            goto L_0x00ae
        L_0x0094:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Found orphaned SplitPairFilter outside of SplitPairRule"
            r9.<init>(r10)
            throw r9
        L_0x009c:
            java.lang.String r7 = "SplitPairRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x00a5
            goto L_0x00e5
        L_0x00a5:
            androidx.window.embedding.SplitPairRule r3 = r8.parseSplitPairRule(r9, r10)
            r0.add(r3)
            r4 = r1
            r6 = r4
        L_0x00ae:
            r5 = r3
            goto L_0x00e5
        L_0x00b0:
            java.lang.String r7 = "ActivityFilter"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x00b9
            goto L_0x00e5
        L_0x00b9:
            if (r4 != 0) goto L_0x00c6
            if (r6 == 0) goto L_0x00be
            goto L_0x00c6
        L_0x00be:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Found orphaned ActivityFilter"
            r9.<init>(r10)
            throw r9
        L_0x00c6:
            androidx.window.embedding.ActivityFilter r3 = r8.parseActivityFilter(r9, r10)
            if (r4 == 0) goto L_0x00d7
            r0.remove(r4)
            androidx.window.embedding.ActivityRule r3 = r4.plus$window_release(r3)
            r0.add(r3)
            goto L_0x0077
        L_0x00d7:
            if (r6 == 0) goto L_0x00e5
            r0.remove(r6)
            androidx.window.embedding.SplitPlaceholderRule r3 = r6.plus$window_release(r3)
            r0.add(r3)
            goto L_0x0061
        L_0x00e5:
            int r3 = r10.next()
            goto L_0x001e
        L_0x00eb:
            int r3 = r10.next()
            goto L_0x001e
        L_0x00f1:
            return r0
        L_0x00f2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitRuleParser.parseSplitXml(android.content.Context, int):java.util.Set");
    }

    public final Set<EmbeddingRule> parseSplitRules$window_release(Context context, int i) {
        C11669k.m56787e(context, "context");
        return parseSplitXml(context, i);
    }
}
