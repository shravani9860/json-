==================================
package java libraries;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;
public class Rate
{
    private int rackRate;

    public void setRackRate(int rackRate){
        this.rackRate = rackRate;
    }
    public int getRackRate(){
        return this.rackRate;
    }
    public static Rate fill(JSONObject jsonobj){
        Rate entity = new Rate();
        if (jsonobj.containsKey("rackRate")) {
            entity.setRackRate(jsonobj.getInt("rackRate"));        
        }
        return entity;
    }
    public static List<Rate> fillList(JSONArray jsonarray) {
        if (jsonarray == null || jsonarray.size() == 0)
            return null;
        List<Rate> olist = new ArrayList<Rate>();
        for (int i = 0; i < jsonarray.size(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }
}

==================================
package java libraries;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;
public class Rateplans
{
    private Rate rate;

    private String rateplanId;

    public void setRate(Rate rate){
        this.rate = rate;
    }
    public Rate getRate(){
        return this.rate;
    }
    public void setRateplanId(String rateplanId){
        this.rateplanId = rateplanId;
    }
    public String getRateplanId(){
        return this.rateplanId;
    }
    public static Rateplans fill(JSONObject jsonobj){
        Rateplans entity = new Rateplans();
        if (jsonobj.containsKey("rate")) {
            entity.setRate(jsonobj.getRate("rate"));        
        }
        if (jsonobj.containsKey("rateplanId")) {
            entity.setRateplanId(jsonobj.getString("rateplanId"));        
        }
        return entity;
    }
    public static List<Rateplans> fillList(JSONArray jsonarray) {
        if (jsonarray == null || jsonarray.size() == 0)
            return null;
        List<Rateplans> olist = new ArrayList<Rateplans>();
        for (int i = 0; i < jsonarray.size(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }
}

==================================
package java libraries;
import java.util.ArrayList;
import java.util.List;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;
public class Rooms
{
    private List<Rateplans> rateplans;

    private String roomId;

    public void setRateplans(List<Rateplans> rateplans){
        this.rateplans = rateplans;
    }
    public List<Rateplans> getRateplans(){
        return this.rateplans;
    }
    public void setRoomId(String roomId){
        this.roomId = roomId;
    }
    public String getRoomId(){
        return this.roomId;
    }
    public static Rooms fill(JSONObject jsonobj){
        Rooms entity = new Rooms();
        if (jsonobj.containsKey("rateplans")) {
            entity.setRateplans(jsonobj.getJSONArray("rateplans"));        
        }
        if (jsonobj.containsKey("roomId")) {
            entity.setRoomId(jsonobj.getString("roomId"));        
        }
        return entity;
    }
    public static List<Rooms> fillList(JSONArray jsonarray) {
        if (jsonarray == null || jsonarray.size() == 0)
            return null;
        List<Rooms> olist = new ArrayList<Rooms>();
        for (int i = 0; i < jsonarray.size(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }
}

==================================
package java libraries;
import java.util.ArrayList;
import java.util.List;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;
public class Root
{
    private DateTime startDate;

    private DateTime endDate;

    private boolean taxInclusive;

    private List<Rooms> rooms;

    public void setStartDate(DateTime startDate){
        this.startDate = startDate;
    }
    public DateTime getStartDate(){
        return this.startDate;
    }
    public void setEndDate(DateTime endDate){
        this.endDate = endDate;
    }
    public DateTime getEndDate(){
        return this.endDate;
    }
    public void setTaxInclusive(boolean taxInclusive){
        this.taxInclusive = taxInclusive;
    }
    public boolean getTaxInclusive(){
        return this.taxInclusive;
    }
    public void setRooms(List<Rooms> rooms){
        this.rooms = rooms;
    }
    public List<Rooms> getRooms(){
        return this.rooms;
    }
    public static Root fill(JSONObject jsonobj){
        Root entity = new Root();
        if (jsonobj.containsKey("startDate")) {
            entity.setStartDate(jsonobj.getDateTime("startDate"));        
        }
        if (jsonobj.containsKey("endDate")) {
            entity.setEndDate(jsonobj.getDateTime("endDate"));        
        }
        if (jsonobj.containsKey("taxInclusive")) {
            entity.setTaxInclusive(jsonobj.getBoolean("taxInclusive"));        
        }
        if (jsonobj.containsKey("rooms")) {
            entity.setRooms(jsonobj.getJSONArray("rooms"));        
        }
        return entity;
    }
    public static List<Root> fillList(JSONArray jsonarray) {
        if (jsonarray == null || jsonarray.size() == 0)
            return null;
        List<Root> olist = new ArrayList<Root>();
        for (int i = 0; i < jsonarray.size(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }
}
