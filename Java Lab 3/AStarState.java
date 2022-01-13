import java.util.HashMap;
public class AStarState
{
    private Map2D map;


    private HashMap<Location, Waypoint>openWaypoints;
    private HashMap<Location, Waypoint>closedWaypoints;


    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
        this.openWaypoints= new HashMap<Location, Waypoint>();
        this.closedWaypoints= new HashMap<Location, Waypoint>();
    }

    public Map2D getMap()
    {
        return map;
    }

    /**
     Проверяет все вершины в наборе открытых вершин,
     и после этого она возвращает ссылку на вершину с наименьшей общей стоимостью.
     Если в "открытом" наборе нет вершин, функция возвращает NULL.
     **/

    public Waypoint getMinOpenWaypoint()
    {
        if(openWaypoints.isEmpty()) /** isEmpty() возвращает логическое значение Boolean,
         которое указывает, была ли инициализирована переменная.**/
            return null;
        else{
            Waypoint minCostWaypoint = null;
            float minCost = Float.MAX_VALUE;
            for(Waypoint wp:openWaypoints.values()) /**Возвращает множество элементов коллекции **/
            {
                float totalCost = wp.getTotalCost();
                if(totalCost<minCost)
                {
                    minCostWaypoint = wp;
                    minCost = totalCost;
                }
            }
            return minCostWaypoint;
        }
    }

    /**
     Добавляет указанную вершину только в том случае, если существующая вершина хуже новой.
     Если в наборе «открытых вершин» в настоящее время нет вершины для данного местоположения,
     то просто добавляем.
     Если в наборе «открытых вершин» уже есть вершина для этой локации,
     добавляем новую вершину только в том случае, если стоимость пути до новой вершины меньше стоимости пути до текущей.
     **/

    public boolean addOpenWaypoint(Waypoint newWP)
    {
        Location loc = newWP.getLocation();
        if(!openWaypoints.containsKey(loc))/**Проверяет наличие ключа в коллекции**/
        {
            openWaypoints.put(loc, newWP);/**Добавляет в коллекцию пару (key, value)**/
            return true;
        }
        else{
            Waypoint oldWP = openWaypoints.get(loc);/**Возвращает значение по ключу.**/
            if(newWP.getPreviousCost()<oldWP.getPreviousCost()) {
                openWaypoints.put(loc, oldWP);
                return true;
            }
            return false;
        }
    }


    /** возвращает количество точек в наборе открытых вершин **/
    public int numOpenWaypoints()
    {
        return openWaypoints.size();
    }


    /**
     Перемещает вершину из набора «открытых вершин» в набор «закрытых вершин»
     **/

    public void closeWaypoint(Location loc)
    {
        Waypoint wp = openWaypoints.remove(loc);
        closedWaypoints.put(loc, wp);
    }

    /**
     Возвращает значение true, если указанное местоположение встречается в наборе закрытых вершин, и false в противном
     **/

    public boolean isLocationClosed(Location loc)
    {
        return (closedWaypoints.keySet().contains(loc));
    }
}
