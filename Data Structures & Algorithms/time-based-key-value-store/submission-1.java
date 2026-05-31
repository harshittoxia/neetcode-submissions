class TimeMap {
    private HashMap<String, Map<Integer, List<String>>>
     datastructure;

    public TimeMap() {
        datastructure = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        //check if key already present
        if(datastructure.containsKey(key)){
            Map<Integer, List<String>> storedValue = datastructure.get(key);
            if(storedValue.containsKey(timestamp)){
                List<String> storedSubValue = storedValue.get(timestamp);
                storedSubValue.add(value);
            }else{
                List<String> newValueList = new ArrayList<>();
                newValueList.add(value);
                storedValue.put(timestamp, newValueList);
            }
        }else{
            // else store new object
            List<String> valueList = new ArrayList<>();
            valueList.add(value);

            HashMap<Integer, List<String>> subValue = new HashMap<>();
            subValue.put(timestamp, valueList);

            datastructure.put(key,subValue);
        }
    }
    
    public String get(String key, int timestamp) {
        if(datastructure.containsKey(key)){
            Map<Integer, List<String>> storedValue = datastructure.get(key);

            if(storedValue.containsKey(timestamp)){
                List<String> subvalue = storedValue.get(timestamp);
                return subvalue.get(0);
            }else {
                return checkLessThanTimestamp(storedValue, timestamp);
            }
        }else{
            return "";
        }
    }

    String checkLessThanTimestamp(Map<Integer, List<String>> datastructure
                                    , int key){
        int minimumKey = 0;
        for(Map.Entry<Integer, List<String>> counter: datastructure.entrySet()){
            if(counter.getKey() <= key){
                minimumKey = Math.max(minimumKey, counter.getKey());
            }
        }

        if(datastructure.containsKey(minimumKey)){
            List<String> subvalue = datastructure.get(minimumKey);
            return subvalue.get(0); 
        }else{
            return "";
        }
    }
}
