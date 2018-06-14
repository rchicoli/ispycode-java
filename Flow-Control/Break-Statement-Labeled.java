public class BreakStatementWithLable {
   public static void main(String[] args) {
      int count = 0;
      Outside:
      while ( count < 6 ) {
         System.out.println("count: " + count++);
         Inside:
            while ( true ) {
            if (count < 3) {
               System.out.println("break Inside");
               break Inside;
            } else {
               System.out.println("break Outside");
               break Outside;
            }
         }
      }
      System.out.println("End: " + count);
   }
}


Output

# java BreakStatementWithLable 
count: 0
break Inside
count: 1
break Inside
count: 2
break Outside
End: 3




<ins class="adsbygoogle"
     style="display:block"
     data-ad-client="ca-pub-4058794840952844"
     data-ad-slot="4835580402"
     data-ad-format="auto">

(adsbygoogle = window.adsbygoogle || []).push({});



   
 


  
    Related ExamplesBreak Statement LabeledBreak Statement UnlabeledContinue StatmentDo While LoopEnhanced For LoopExamplesFor Each LoopFor LoopIf Else If StatementIf Else StatementIf StatmentNested For LoopWhile Loop


<ins class="adsbygoogle"
     style="display:block"
     data-ad-client="ca-pub-4058794840952844"
     data-ad-slot="1144086401"
     data-ad-format="auto">

(adsbygoogle = window.adsbygoogle || []).push({});


13
   
 

 


  
  







