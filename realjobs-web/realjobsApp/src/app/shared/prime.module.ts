import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {AccordionModule} from "primeng/accordion";
import {AutoCompleteModule} from "primeng/autocomplete";
import {ButtonModule} from "primeng/button";
import {RadioButtonModule} from "primeng/radiobutton";
import {DropdownModule} from "primeng/dropdown";
import {CardModule} from "primeng/card";
import {InputMaskModule} from "primeng/inputmask";
import {InputNumberModule} from "primeng/inputnumber";
import {InputSwitchModule} from "primeng/inputswitch";
import {InputTextareaModule} from "primeng/inputtextarea";
import {InputTextModule} from "primeng/inputtext";
import {DialogModule} from "primeng/dialog";
import {ConfirmDialogModule} from "primeng/confirmdialog";
import {DynamicDialogModule} from "primeng/dynamicdialog";
import {FileUploadModule} from "primeng/fileupload";
import {ChipsModule} from "primeng/chips";
import {ListboxModule} from "primeng/listbox";
import {CalendarModule} from "primeng/calendar";
import {PaginatorModule} from "primeng/paginator";
import {MenubarModule} from "primeng/menubar";
import {MenuModule} from "primeng/menu";
import {TreeTableModule} from "primeng/treetable";
import {TreeModule} from "primeng/tree";
import {VirtualScrollerModule} from "primeng/virtualscroller";
import {ToastModule} from "primeng/toast";



@NgModule({
    declarations: [],
    imports: [
        AccordionModule,
        ButtonModule,
        RadioButtonModule,
        CardModule,
        InputMaskModule,
        InputNumberModule,
        InputSwitchModule,
        InputTextareaModule,
        InputTextModule,
        DialogModule,
        ConfirmDialogModule,
        DynamicDialogModule,
        FileUploadModule,
        ChipsModule,
        ListboxModule,
        CalendarModule,
        MenubarModule,
        MenuModule,
        ToastModule
    ],
    exports: [
        AccordionModule,
        ButtonModule,
        RadioButtonModule,
        CardModule,
        InputMaskModule,
        InputNumberModule,
        InputSwitchModule,
        InputTextareaModule,
        InputTextModule,
        DialogModule,
        ConfirmDialogModule,
        DynamicDialogModule,
        FileUploadModule,
        ChipsModule,
        ListboxModule,
        CalendarModule,
        MenubarModule,
        MenuModule,
        ToastModule
    ]
})
export class PrimeModule { }
