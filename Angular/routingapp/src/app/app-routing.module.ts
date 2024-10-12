import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { ContactComponent } from './contact/contact.component';
import { BlogComponent } from './blog/blog.component';

const routes: Routes = [
  // {path:"",redirectTo:'home',pathMatch:"full"},
  // {path:'home',component:HomeComponent},
  // {path:'about',component:AboutComponent,children:[{path:'blog',component:BlogComponent}]},
  // {path:'contact',component:ContactComponent},
  { path: 'home', loadChildren: () => import('./module/home/home.module').then(m => m.HomeModule) },
  { path: 'about', loadChildren: () => import('./module/about/about.module').then(m => m.AboutModule) },
  { path: 'contact', loadChildren: () => import('./module/contact/contact.module').then(m => m.ContactModule) },
  { path: 'notfound', loadChildren: () => import('./module/notfound/notfound.module').then(m => m.NotfoundModule) }
  // {path:"**",component:NotfoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
