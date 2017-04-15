package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FlexWebDriver {

    private final WebDriver webDriver;
    private final String flashObjectId;
 
    public FlexWebDriver(final WebDriver webDriver, final String flashObjectId) {    
        this.webDriver = webDriver;
        this.flashObjectId = flashObjectId;
    }

 
     public String doFlexClickMenuBarUIComponent(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexClickMenuBarUIComponent", objectId, optionalButtonLabel);
   }

    public String doFlexClickMenuBarUIComponent(final String objectId) {
         return doFlexClickMenuBarUIComponent(objectId, "");
    }
    public String click(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexClick", objectId, optionalButtonLabel);
   }

    public String click(final String objectId) {
         return click(objectId, "");
    }
    public String ClickDataGridItem(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexClickDataGridItem", objectId, optionalButtonLabel);
   }

    public String ClickDataGridItem(final String objectId) {
         return click(objectId, "");
    }
 
    public String FlexClickDataGridUIComponent(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexClickDataGridUIComponent", objectId, optionalButtonLabel);
   }

    public String FlexClickDataGridUIComponent(final String objectId) {
         return FlexClickDataGridUIComponent(objectId, "");
    }
 
    public String FlexSelectComboByLabel(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexSelectComboByLabel", objectId, optionalButtonLabel);
   }

    public String FlexSelectComboByLabel(final String objectId) {
         return FlexSelectComboByLabel(objectId, "");
    }
    
    public String FlexSelect(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexSelect", objectId, optionalButtonLabel);
   }

    public String FlexSelect(final String objectId) {
         return FlexSelect(objectId, "");
    }
    public String FlexRefreshIDToolTips(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexRefreshIDToolTips", objectId, optionalButtonLabel);
   }

    public String FlexRefreshIDToolTips(final String objectId) {
         return FlexRefreshIDToolTips(objectId, "");
    }
    public String FlexDoubleClick(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexDoubleClick", objectId, optionalButtonLabel);
   }

    public String FlexDoubleClick(final String objectId) {
         return FlexDoubleClick(objectId, "");
    }
    public String FlexSetFocus(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexSetFocus", objectId, optionalButtonLabel);
   }

    public String FlexSetFocus(final String objectId) {
         return FlexSetFocus(objectId, "");
    }
    public String FlexMouseMove(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexMouseMove", objectId, optionalButtonLabel);
   }

    public String FlexMouseMove(final String objectId) {
         return FlexMouseMove(objectId, "");
    }
   
    public String FlexType(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexType", objectId, optionalButtonLabel);
   }

    public String FlexType(final String objectId) {
         return FlexType(objectId, "");
    }
 
    public String getFlexDataFieldLabelForGridRow(
            String dataGridId, String field, int row) {
        return call("getFlexDataGridFieldLabelForGridRow", dataGridId, field, Integer.toString(row));
    }
    public int getFlexDataGridRowCount(String dataGridId ) {
        return Integer.parseInt(call("getFlexDataGridRowCount", dataGridId));
    }
    public int getSelectionIndex(String selectionFieldId) {
        return Integer.parseInt(call("getFlexSelectionIndex", selectionFieldId, ""));
    }
   
//...  my custom methods  ...
   
    public String alertResponse(final String response, final String optionalValue) {    
        return call("doFlexAlertResponse", response, optionalValue);
   }

    public String alertResponse(final String response) {
         return alertResponse(response, "");
    }
   
    public String getGridValue(final String objectId, final String row , final String col) {    
     
     String consolidatedStream = objectId + "," + row +","+col;
        return call("getFlexDataGridCell", consolidatedStream);
   }
    
    
    public String selectDataGridRow(final String objectId, final String row) {    
        return call("doFlexSelectDataGridRow", objectId, row);
   }
    
    public String ClickAccordionControl(final String objectId, final String label) {    
        return call("myAccordionClick", objectId, label);
   }
    
    public String getFlexDataGridCell(String dataGridId, String row, String col){

    	return call("getFlexDataGridCell", dataGridId+"," + row +","+ col );
    	}
    
    public String getFlexDataGridCellElement(String dataGridId, String totalRows, String totalCols, String row, String col ){

    	return call("getFlexDataGridCellElement", dataGridId+","+totalRows +","+totalCols+"," +row +","+col);
    	}
    
    public String FlexSelectTreeItem(String dataGridId, String item ){

    	return call("doFlexSelectTreeItem", dataGridId,item);
    	}
    
    public String getFlexText(String objectId ){

    	return call("getFlexText", objectId,"");
    	}
    
    public String tickRadioButton(String objectId ){

    	return call("doFlexRadioButton", objectId,"");
    	}
    
    public String getObjectType(String objectId ){

    	return call("getMyObjectType", objectId);
    	}
    
    public String FlexSelectIndex(final String objectId, final String optionalButtonLabel) {    
        return call("doFlexSelectIndex", objectId, optionalButtonLabel);
   }
    
    public String selectTreeItem(final String objectId, final String optionalButtonLabel, final String treeDepth) {    
        return call("selectFlexTreeItem",  objectId, optionalButtonLabel, treeDepth);
   }
    
  

//... Omitted for clarity ...

    private String call(final String functionName, final String... args) {
    
     final Object result =
            ((JavascriptExecutor)webDriver).executeScript(
                 makeJsFunction(functionName, args),
                 new Object[0]);
    
    
     System.out.println("Action result : " + result );

         return result != null ? result.toString() : null;
    }

    private String makeJsFunction(final String functionName, final String... args) {
         final StringBuffer functionArgs = new StringBuffer();

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                if (i > 0) {
                    functionArgs.append(",");
            }
                functionArgs.append(String.format("'%1$s'", args[i]));
         }
        }
     
        System.out.println("Executing : " + String.format(
            "document.%1$s.%2$s(%3$s);",
            flashObjectId,
            functionName,
            functionArgs));
        return String.format(
            "return document.%1$s.%2$s(%3$s);",
            flashObjectId,
            functionName,
            functionArgs);
    }


}