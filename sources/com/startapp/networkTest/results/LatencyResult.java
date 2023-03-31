package com.startapp.networkTest.results;

import com.startapp.C8915da;
import com.startapp.C9226pb;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.results.speedtest.MeasurementPointLatency;
import java.util.ArrayList;

/* compiled from: Sta */
public class LatencyResult extends P3TestResult {
    public String AirportCode;
    public long DurationOverall = -1;
    public long DurationOverallNoSleep = -1;
    public double Jitter;
    public String LtrId = "";
    @C9226pb(type = ArrayList.class, value = MeasurementPointLatency.class)
    public ArrayList<MeasurementPointLatency> MeasurementPoints;
    public int Pause;
    public int Pings;
    public ScreenStates ScreenStateOnEnd;
    public ScreenStates ScreenStateOnStart;
    public int SuccessfulPings;

    public LatencyResult(String str, String str2) {
        super(str, str2);
        ScreenStates screenStates = ScreenStates.Unknown;
        this.ScreenStateOnStart = screenStates;
        this.ScreenStateOnEnd = screenStates;
        this.AirportCode = "";
        this.MeasurementPoints = new ArrayList<>();
    }

    public void calculateStats(ArrayList<MeasurementPointLatency> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).Rtt != -1) {
                arrayList2.add(Integer.valueOf(arrayList.get(i).Rtt));
            }
        }
        this.MinValue = C8915da.m48524e(arrayList2);
        this.MaxValue = C8915da.m48522c(arrayList2);
        this.AvgValue = C8915da.m48518a(arrayList2);
        this.MedValue = C8915da.m48523d(arrayList2);
        this.Jitter = C8915da.m48520b(arrayList2);
        this.MeasurementPoints = arrayList;
    }
}
