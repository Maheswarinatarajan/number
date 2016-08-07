public int maxSpan(int[] nums) {    
    int count=1;//keep an intial count of maxspan=1    
    int maxspan=0;//initialize maxspan=0    
    for(int i=0;i<nums.length;i++){    
        for(int j=i+1;j<nums.length;j++){    
              if(nums[i] == nums[j]){
                 //check to see if "i" index contents == "j" index contents    
                 count++;    //increment count
                 maxspan=count;  //make maxspan as your final count  
                 int number = nums[i]; //number=actual number for maxspan               
              }                            
        }       
    }    
  return maxspan+1; //return maxspan        
}    