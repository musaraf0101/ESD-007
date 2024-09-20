import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { BlogComponent } from './blog/blog.component';
import { EventComponent } from './event/event.component';

const routes: Routes = [
  {path:'',redirectTo:"home",pathMatch:'full'},// default url normaly work home page coding must need give pathMach:'full' para coding
  {path:'home',component:HomeComponent},
  {path:'about',component:AboutComponent,children:[
    {path:'blog',component:BlogComponent},
    {path:'event',component:EventComponent}
  ]},
  {path:'contact',component:ContactComponent},
  {path:'**',component:NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
